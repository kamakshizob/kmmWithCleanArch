package com.dipumba.movies.di

import com.dipumba.movies.data.remote.MovieService
import com.dipumba.movies.data.remote.RemoteDataSource
import com.dipumba.movies.data.repository.MovieRepositoryImpl
import com.dipumba.movies.domain.repository.MovieRepository
import com.dipumba.movies.domain.usecase.GetMovieUseCase
import com.dipumba.movies.domain.usecase.GetMoviesUseCase
import com.dipumba.movies.util.provideDispatcher
import org.koin.dsl.module

/** step-13 so here just keeps the things organized
factory just will create a new instance each time that we need like for our remote data**/

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }

    /**
     * RemoteDataSource needs a apiService aswell as dispatcher so we going to tell koin ok i'll
       provide you these dependencies aswell by calling the get() method. ***/

    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }  //this is just for our dispatcher
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules  //so whenever need to start koin we can just call this  method












