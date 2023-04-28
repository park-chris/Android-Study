package com.crystal.weather

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import com.crystal.weather.databinding.ItemForecastBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WeatherRepository {



    private val retrofit = Retrofit.Builder()
        .baseUrl("http://apis.data.go.kr/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val service = retrofit.create(WeatherService::class.java)

    @RequiresApi(Build.VERSION_CODES.O)
    fun getVillageForecast(
        longitude: Double,
        latitude: Double,
        successCallback: (List<Forecast>) -> Unit,
        failureCallback: (Throwable) -> Unit
    ) {
        val baseDateTime = BaseDateTime.getBaseDateTime()
        val converter = GeoPointConverter()
        val point = converter.convert(lat = latitude, lon = longitude)

        service.getVillageForecast(
            serviceKey = "${공공 데이터 서비스 키}",
            baseDate = baseDateTime.baseDate,
            baseTime = baseDateTime.baseTime,
            nx = point.nx,
            ny = point.ny
        ).enqueue(object : Callback<WeatherEntity> {
            override fun onResponse(call: Call<WeatherEntity>, response: Response<WeatherEntity>) {

                Log.d("weatherRepository", "reponse: ${response.body()}")

                val forecastDateTimeMap = mutableMapOf<String, Forecast>()
                val forecastList =
                    response.body()?.response?.body?.items?.forecastEntities.orEmpty()

                Log.e("WeatherReopsitory", "forecastList : $forecastList")
                // 가져온 일기예보 데이터 넣기
                for (forecast in forecastList) {

                    if (forecastDateTimeMap["${forecast.forecastDate}/${forecast.forecastTime}"] == null) {
                        forecastDateTimeMap["${forecast.forecastDate}/${forecast.forecastTime}"] =
                            Forecast(
                                forecastDate = forecast.forecastDate,
                                forecastTime = forecast.forecastTime
                            )
                    }

                    forecastDateTimeMap["${forecast.forecastDate}/${forecast.forecastTime}"]?.apply {

                        when (forecast.category) {
                            Category.POP -> precipitation = forecast.forecastValue.toInt()
                            Category.PTY -> precipitationType = transformRainType(forecast)
                            Category.SKY -> sky = transformSky(forecast)
                            Category.TMP -> temperature = forecast.forecastValue.toDouble()
                            else -> {}
                        }
                    }
                }

                val list = forecastDateTimeMap.values.toMutableList()
                list.sortWith { forecast1, forecast2 ->
                    val f1DateTime = "${forecast1.forecastDate}${forecast1.forecastTime}"
                    val f2DateTime = "${forecast2.forecastDate}${forecast2.forecastTime}"

                    return@sortWith f1DateTime.compareTo(f2DateTime)
                }

                if (list.isEmpty()) {
                    failureCallback(NullPointerException())
                } else {
                    successCallback(list)
                }
            }

            override fun onFailure(call: Call<WeatherEntity>, t: Throwable) {
                failureCallback(t)
            }

        })
    }

    private fun transformRainType(forecastEntity: ForecastEntity): String {
        return when (forecastEntity.forecastValue.toInt()) {
            0 -> "없음"
            1 -> "비"
            2 -> "비/눈"
            3 -> "눈"
            4 -> "소나기"
            else -> ""
        }
    }

    private fun transformSky(forecastEntity: ForecastEntity): String {
        return when (forecastEntity.forecastValue.toInt()) {
            1 -> "맑음"
            3 -> "구름많음"
            4 -> "흐림"
            else -> ""
        }
    }

}