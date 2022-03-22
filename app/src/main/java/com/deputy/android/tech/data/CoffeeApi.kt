package com.deputy.android.tech.data

import com.deputy.android.tech.model.Coffee
import retrofit2.http.GET

interface CoffeeApi {
    @GET("random.json")
    suspend fun getRandom(): Coffee

    companion object {
        const val API_URL = "https://coffee.alexflipnote.dev/"
    }
}
