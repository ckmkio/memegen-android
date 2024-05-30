package io.ckmk.memegen.viewmodel.home

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.ckmk.memegen.network.ApiState
import io.ckmk.memegen.repository.GiphyRepository
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val giphyRepository: GiphyRepository) : ViewModel() {

    val getTrendGifsResponse: MutableState<ApiState> = mutableStateOf(ApiState.Empty)

    init {
        getTrendGifs()
    }

    fun getTrendGifs() =
        viewModelScope.launch {
            giphyRepository.getTrendingGifs().onStart {
                getTrendGifsResponse.value = ApiState.Loading
            }.catch {
                getTrendGifsResponse.value = ApiState.Failure(it)
            }.collect {
                getTrendGifsResponse.value = ApiState.Success(it)
            }
        }
}