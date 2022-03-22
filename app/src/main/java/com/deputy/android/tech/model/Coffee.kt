package com.deputy.android.tech.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Coffee(
    val file: String
)
