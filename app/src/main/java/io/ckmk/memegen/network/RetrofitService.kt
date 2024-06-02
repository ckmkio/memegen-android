package io.ckmk.memegen.network

import io.ckmk.memegen.model.GetTrendingGifsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    @GET("v1/gifs/trending")
    suspend fun getTrendingGifs(
        @Query("limit") limit: Int,
        @Query("api_key") apiKey: String
    ): GetTrendingGifsResponse
}