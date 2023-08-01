package com.dipumba.movies.domain.repository

import com.dipumba.movies.domain.model.Movie

//  step-10 this should be an interface ,so now we have to give actual
//  implemetion for this repositry that i have to create an under data layer new repo impl
internal interface MovieRepository {
    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie
}