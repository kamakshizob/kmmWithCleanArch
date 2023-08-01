package com.dipumba.movies.domain.usecase

import com.dipumba.movies.domain.model.Movie
import com.dipumba.movies.domain.repository.MovieRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
//  step-12.1 so i m using the KoinComponent here so that's why i can directly inject the view on
//// the repositry inside this get use cases bcos in the we do not have way to inject instances so i m declare
////here below things
class GetMoviesUseCase: KoinComponent {
    private val repository: MovieRepository by inject()

    @Throws(Exception::class)
    suspend operator fun invoke(page: Int): List<Movie>{
        return repository.getMovies(page = page)
    }
}