package com.corvolabs.bluelabsmovie.data.network

import com.corvolabs.bluelabsmovie.R
import com.corvolabs.bluelabsmovie.core.RetrofitHelper
import com.corvolabs.bluelabsmovie.data.model.MovieModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MovieService {
    val apiKey = "349350178e3ce2fda7c1a27c421d77c2"
    val page = 1
    private val retrofit = RetrofitHelper.getRetrofit()
    suspend fun getMovies():List<MovieModel>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(ApiService::class.java).getPopularMovies(apiKey,page)
            response.body() ?: emptyList()
        }
    }
}