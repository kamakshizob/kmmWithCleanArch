package com.dipumba.movies.data.remote

import kotlinx.serialization.SerialName

//  step-1 creating a data class
@kotlinx.serialization.Serializable
internal data class MovieRemote(
    val id: Int,
    val title: String,
    val overview: String,
    @SerialName("poster_path")
    val posterImage: String,
    @SerialName("release_date")
    val releaseDate: String
)
