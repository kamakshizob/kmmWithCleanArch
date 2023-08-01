package com.dipumba.movies.data.remote

import io.ktor.client.call.*
import io.ktor.client.request.*
//  step-4 creating movieServies class and its extends the KtorApi class

internal class MovieService: KtorApi() {

    suspend fun getMovies(page: Int = 1): MoviesResponse = client.get {
        pathUrl("movie/popul ar")
        parameter("page", page)
    }.body()

    suspend fun getMovie(movieId: Int): MovieRemote = client.get {
        pathUrl("movie/${movieId}")
    }.body()
}