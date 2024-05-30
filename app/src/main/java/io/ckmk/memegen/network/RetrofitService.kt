package io.ckmk.memegen.network

import io.ckmk.memegen.model.Gif
import retrofit2.http.GET

interface RetrofitService {

    @GET("v1/gifs/trending")
    suspend fun getTrendingGifs(): List<Gif>
}