package com.dipumba.movies.data.repository

import com.dipumba.movies.data.remote.RemoteDataSource
import com.dipumba.movies.data.util.toMovie
import com.dipumba.movies.domain.model.Movie
import com.dipumba.movies.domain.repository.MovieRepository
//  step-11 create a MovieRepositoryImpl and override the method
internal class MovieRepositoryImpl(
    //here this needs a instance of movie remote the datasource
    private val remoteDateSource: RemoteDataSource
): MovieRepository {

    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDateSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDateSource.getMovie(movieId = movieId).toMovie()
    }
}