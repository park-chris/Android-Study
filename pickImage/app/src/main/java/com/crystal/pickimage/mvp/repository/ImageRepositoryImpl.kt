package com.crystal.pickimage.mvp.repository

import com.crystal.pickimage.ImageResponse
import com.crystal.pickimage.RetrofitManager
import retrofit2.Call
import retrofit2.Response

class ImageRepositoryImpl: ImageRepository {
    override fun getRandomImage(callback: ImageRepository.CallBack) {
        RetrofitManager.imageService.getRandomImage()
            .enqueue(object : retrofit2.Callback<ImageResponse> {
                override fun onResponse(
                    call: Call<ImageResponse>,
                    response: Response<ImageResponse>
                ) {
                    if (response.isSuccessful) {
                        response.body()?.let {
                            callback.loadImage(it.urls.regular, it.color)
                        }
                    }
                }

                override fun onFailure(call: Call<ImageResponse>, t: Throwable) {
                }

            })
    }
}