package com.crystal.weather

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Geocoder
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import com.crystal.weather.databinding.ActivityMainBinding
import com.crystal.weather.databinding.ItemForecastBinding
import com.google.android.gms.location.LocationServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.Exception
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.O)
    val locationPermissionRequest = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        when {
            permissions.getOrDefault(android.Manifest.permission.ACCESS_COARSE_LOCATION, false) -> {
                // Only approximate location access granted.
                updateLocation()
            }
            else -> {
                Toast.makeText(this, "위치 권한이 필요합니다.", Toast.LENGTH_SHORT).show()
                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                    data = Uri.fromParts("package", packageName, null)
                }
                startActivity(intent)
                finish()
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 권한 요청
        locationPermissionRequest.launch(arrayOf(android.Manifest.permission.ACCESS_COARSE_LOCATION))



    }



    @RequiresApi(Build.VERSION_CODES.O)
    private fun updateLocation() {
        val fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            locationPermissionRequest.launch(arrayOf(android.Manifest.permission.ACCESS_COARSE_LOCATION))
            return
        }

        fusedLocationClient.lastLocation.addOnSuccessListener {


            Thread {

                try {
                    val addressList = Geocoder(this, Locale.KOREA).getFromLocation(
                        it.latitude,
                        it.longitude,
                        1)


                    runOnUiThread {
                        binding.locationTextView.text = addressList?.get(0)?.thoroughfare.orEmpty()
                    }

                }catch (e: Exception) {
                    e.printStackTrace()
                }


            }.start()


            WeatherRepository.getVillageForecast(
                longitude = it.longitude,
                latitude = it.latitude,
                successCallback = { list ->

                    val currentForecast = list.first()

                    binding.temperatureTextView.text = getString(R.string.temperature_text, currentForecast.temperature)
                    binding.skyTextView.text = currentForecast.weather
                    binding.precipitationTextView.text = getString(R.string.precipitation_text, currentForecast.precipitation)

                    binding.childForecastLayout.apply {
                        list.forEachIndexed { index, forecast ->
                            if (index == 0) {
                                return@forEachIndexed
                            }

                            val itemView = ItemForecastBinding.inflate(layoutInflater)
                            itemView.timeTextView.text = forecast.forecastTime
                            itemView.temperatureTextView.text = getString(R.string.temperature_text, forecast.temperature)
                            itemView.weatherTextView.text = forecast.weather

                            addView(itemView.root)
                        }
                    }

                },
                failureCallback = {
                    it.printStackTrace()
                }
            )

        }
    }

}