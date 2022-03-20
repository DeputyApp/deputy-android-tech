package com.deputy.android.tech.data

class Repository(
    private val apiService: ApiService = ApiService()
) {

    suspend fun getRandomCoffee() = apiService.coffeeApi.getRandom()
}
