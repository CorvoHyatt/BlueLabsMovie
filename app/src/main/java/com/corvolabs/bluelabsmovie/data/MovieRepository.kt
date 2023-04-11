package com.corvolabs.bluelabsmovie.data

import com.corvolabs.bluelabsmovie.data.model.MovieModel
import com.corvolabs.bluelabsmovie.data.model.MovieProvider
import com.corvolabs.bluelabsmovie.data.network.MovieService

class MovieRepository {
    private val api = MovieService()
    suspend fun getMovies(): List<MovieModel>{
        val response = api.getMovies()
        MovieProvider.movies = response
        return response

    }
}