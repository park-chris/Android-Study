package com.crystal.mediasearch

import com.crystal.mediasearch.model.ImageListResponse
import com.crystal.mediasearch.model.VideoListResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface SearchService {

    @Headers("Authorization: KakaoAK c7048bf76432a49f935303edaabd2e58")
    @GET("image")
    fun searchImage(@Query("query") query: String): Observable<ImageListResponse>


    @Headers("Authorization: KakaoAK c7048bf76432a49f935303edaabd2e58")
    @GET("vclip")
    fun searchVideo(@Query("query") query: String): Observable<VideoListResponse>
}