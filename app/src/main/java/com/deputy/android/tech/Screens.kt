package com.deputy.android.tech

enum class Screens {
    Main,
    Animals,
    Books,
    Coffee;

    companion object {
        fun fromRoute(route: String?): Screens =
            when (route?.substringBefore("/")) {
                Main.name -> Main
                Animals.name -> Animals
                Books.name -> Books
                Coffee.name -> Coffee
                else -> throw IllegalArgumentException("Route $route is not recognized.")
            }
    }
}
