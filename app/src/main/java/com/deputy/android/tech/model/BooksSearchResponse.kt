package com.deputy.android.tech.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BooksSearchResponse(
    val docs: List<Book>
)
