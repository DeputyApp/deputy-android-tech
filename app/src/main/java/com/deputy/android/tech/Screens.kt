package com.deputy.android.tech

enum class Screens {
    Main,
    Animals,
    Books;

    companion object {
        fun fromRoute(route: String?): Screens =
            when (route?.substringBefore("/")) {
                Main.name -> Main
                Animals.name -> Animals
                Books.name -> Books
                else -> throw IllegalArgumentException("Route $route is not recognized.")
            }
    }
}
