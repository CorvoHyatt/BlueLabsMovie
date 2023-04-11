package com.corvolabs.bluelabsmovie.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.corvolabs.bluelabsmovie.data.model.MovieModel
import com.corvolabs.bluelabsmovie.domain.GetMoviesUseCase
import kotlinx.coroutines.launch

class MovieViewModel: ViewModel() {
    val movieModel = MutableLiveData<MovieModel>()
    var getMoviesUseCase = GetMoviesUseCase()

    fun onCreate() {
        viewModelScope.launch {
            var result = getMoviesUseCase()
            if(!result.isNullOrEmpty()){
                movieModel.postValue(result[0])
            }
        }
    }

}