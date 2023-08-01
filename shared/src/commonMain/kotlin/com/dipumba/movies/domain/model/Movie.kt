package com.dipumba.movies.domain.model

//  step-8 create a model class this is kind of data
data class Movie(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
    val releaseDate: String
)
