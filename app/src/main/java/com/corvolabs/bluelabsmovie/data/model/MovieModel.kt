package com.corvolabs.bluelabsmovie.data.model

import com.google.gson.annotations.SerializedName

data class MovieModel(
    val id: Int,
    @SerializedName("poster_path") val posterPath: String?,
    val title: String?,
    @SerializedName("vote_average") val voteAverage: Double?
)
