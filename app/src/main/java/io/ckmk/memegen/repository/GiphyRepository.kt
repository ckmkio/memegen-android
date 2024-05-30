package io.ckmk.memegen.repository

import io.ckmk.memegen.model.Gif
import io.ckmk.memegen.network.RetrofitService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GiphyRepository @Inject constructor(private val retrofitService: RetrofitService) {
    fun getTrendingGifs(): Flow<List<Gif>> = flow {
        emit(retrofitService.getTrendingGifs())
    }.flowOn(Dispatchers.IO)
}