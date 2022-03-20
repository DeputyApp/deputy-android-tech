package com.deputy.android.tech.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiService {

    val coffeeApi by lazy {
        Retrofit
            .Builder()
            .baseUrl(CoffeeApi.API_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(CoffeeApi::class.java)
    }
}
