package io.ckmk.memegen.viewmodel.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.ckmk.memegen.model.Gif
import io.ckmk.memegen.repository.GiphyRepository
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val giphyRepository: GiphyRepository) : ViewModel() {

    var gifs = MutableLiveData<List<Gif>>()

    fun getTrendGifs() =
        viewModelScope.launch {
            giphyRepository.getTrendingGifs().onStart {
            }.catch {
                it.printStackTrace()
            }.collect {
                gifs.postValue(it.data)
            }
        }
}