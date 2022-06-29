package com.cristiandev.recyclerview_practice.model

class SuperHeroProvider {
    companion object{
        val superHeroList = listOf<SuperHero>(
            SuperHero(
                "Batman",
                "Bruce Wayne",
                "DC",
                "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"
            ),
            SuperHero(
                "Spiderman",
                "Peter Parker",
                "DC",
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"
            ),
            SuperHero(
                "Thor",
                "Thor",
                "Marvel",
                "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"
            ),
            SuperHero(
                "Wonder Woman",
                "Diana",
                "Marvel",
                "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"
            ),
            SuperHero(
                "Wolverine",
                "Logan",
                "Marvel",
                "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"
            ),
            SuperHero(
                "Green Lantern",
                "Alan Scott",
                "DC",
                "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"
            ),
        )
    }
}