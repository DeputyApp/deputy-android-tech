package com.deputy.android.tech.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Book(
    val title: String,
    val author_name: List<String>
)
