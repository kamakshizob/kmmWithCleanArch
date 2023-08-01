package com.dipumba.movies.data.remote

// step-2 creating a data class which is containing the data from the movieRemote.

@kotlinx.serialization.Serializable
internal data class MoviesResponse(
    val results: List<MovieRemote>
)
