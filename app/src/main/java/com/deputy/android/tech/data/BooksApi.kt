package com.deputy.android.tech.data

import com.deputy.android.tech.model.BooksSearchResponse
import retrofit2.http.GET

interface BooksApi {

    @GET("search.json?title=Kotlin")
    suspend fun searchForKotlinBooks(): BooksSearchResponse

    companion object {
        const val API_URL = "http://openlibrary.org/"
    }
}
