package com.dipumba.movies.data.util

import com.dipumba.movies.data.remote.MovieRemote
import com.dipumba.movies.domain.model.Movie

//  step-9 so now we are gonna pass data to the Data layer to Domain Layer
internal fun MovieRemote.toMovie(): Movie{
    return Movie(
        id = id,
        title = title,
        description = overview,
        imageUrl = getImageUrl(posterImage),
        releaseDate = releaseDate
    )
}

private fun getImageUrl(posterImage: String) = "https://image.tmdb.org/t/p/w500/$posterImage"