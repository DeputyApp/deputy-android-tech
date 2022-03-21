package com.deputy.android.tech.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Animal(
    val name: String,
    val latin_name: String,
    val animal_type: String,
    val active_time: String,
    val length_min: Double,
    val length_max: Double,
    val weight_min: Int,
    val weight_max: Int,
    val lifespan: Int,
    val habitat: String,
    val diet: String,
    val geo_range: String,
    val image_link: String,
    val id: Int
)
