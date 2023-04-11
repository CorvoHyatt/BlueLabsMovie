package com.corvolabs.bluelabsmovie.domain

import com.corvolabs.bluelabsmovie.data.MovieRepository
import com.corvolabs.bluelabsmovie.data.model.MovieModel

class GetMoviesUseCase {
    private val repository = MovieRepository()

    suspend operator fun invoke(): List<MovieModel>? = repository.getMovies()
}