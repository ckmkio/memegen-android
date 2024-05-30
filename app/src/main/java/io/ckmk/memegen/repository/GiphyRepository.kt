package io.ckmk.memegen.repository

import io.ckmk.memegen.app.Config
import io.ckmk.memegen.model.GetTrendingGifsResponse
import io.ckmk.memegen.model.Gif
import io.ckmk.memegen.network.RetrofitService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GiphyRepository @Inject constructor(private val retrofitService: RetrofitService) {
    fun getTrendingGifs(): Flow<GetTrendingGifsResponse> = flow {
        emit(retrofitService.getTrendingGifs(25, Config.API_KEY_GIPHY))
    }.flowOn(Dispatchers.IO)
}