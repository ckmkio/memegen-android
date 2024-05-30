package io.ckmk.memegen.network

import io.ckmk.memegen.model.Gif

sealed class ApiState {
    class Success(val data: List<Gif>): ApiState()
    class Failure(val msg: Throwable): ApiState()
    object Loading: ApiState()
    object Empty: ApiState()
}