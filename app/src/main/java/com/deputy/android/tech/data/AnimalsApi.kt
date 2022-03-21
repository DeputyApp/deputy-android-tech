package com.deputy.android.tech.data

import com.deputy.android.tech.model.Animal
import retrofit2.http.GET

interface AnimalsApi {

    @GET("animals/rand")
    suspend fun getRandom(): Animal

    companion object {
        const val API_URL = "https://zoo-animal-api.herokuapp.com/"
    }
}