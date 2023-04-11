package com.corvolabs.bluelabsmovie.data.network

import com.corvolabs.bluelabsmovie.data.model.MovieModel
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Response
interface ApiService {
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String,
        @Query("page") page: Int
    ): Response<List<MovieModel>>
}