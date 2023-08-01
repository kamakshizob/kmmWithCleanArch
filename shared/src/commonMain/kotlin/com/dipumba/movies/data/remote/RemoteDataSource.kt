package com.dipumba.movies.data.remote

import com.dipumba.movies.util.Dispatcher
import kotlinx.coroutines.withContext

//  step-7 that is a class which is responsiable frst of all to provide the remote to repositry
//aswell as switching our network call to a background track
internal class RemoteDataSource(

    //here this will need an instance of our movie service aswell as dispatcher
    private val apiService: MovieService,
    private val dispatcher: Dispatcher
) {

    suspend fun getMovies(page: Int) = withContext(dispatcher.io){
        apiService.getMovies(page = page)
    }


    //this method is for get a single movie
    suspend fun getMovie(movieId: Int) = withContext(dispatcher.io){//withContext is runnable for Main
        apiService.getMovie(movieId = movieId)
    }
}