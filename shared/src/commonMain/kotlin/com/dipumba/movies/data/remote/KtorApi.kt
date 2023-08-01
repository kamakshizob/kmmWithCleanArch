package com.dipumba.movies.data.remote

import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

//  step-3 creating a Ktor for api

private const val BASE_URL = "https://api.themoviedb.org/"
private const val API_KEY = "33a006b0fb255e5544956f5af83d655d"

internal abstract class KtorApi {
    //added this internal keyword for optimizing on the ios side bcoz this will tell the
    //native kotlin compiler thst it should not prevent from exposing this to other modules but also the internal
    //the internal keyword will limit number of objective c adapter

    val client = HttpClient {
        install(ContentNegotiation){
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }


    fun HttpRequestBuilder.pathUrl(path: String){
        url {
            takeFrom(BASE_URL)
            path("3", path)
            parameter("api_key", API_KEY)
        }
    }
}