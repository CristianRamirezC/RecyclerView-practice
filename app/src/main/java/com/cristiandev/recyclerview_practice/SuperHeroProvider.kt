package com.cristiandev.recyclerview_practice

class SuperHeroProvider {
    companion object{
        val superHeroList = listOf<SuperHero>(
            SuperHero(
                "Batman",
                "Bruce Wayne",
                "DC Comics",
                "https://www.quever.news/u/fotografias/m/2022/2/25/f848x477-24647_82450_5119.jpg"
            ),
            SuperHero(
                "Superman",
                "Clark Kent",
                "DC Comics",
                "https://i.blogs.es/fea2de/henry-cavill-superman/450_1000.jpeg"
            ),
            SuperHero(
                "Thor",
                "Thor",
                "Marvel",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMNJd_5aLYuGCO63PtspHIGGxFbr08uP6TBtkKDYhs-EkyQ4BxGT0lENqaHF0ACkT044M&usqp=CAU"
            ),
            SuperHero(
                "IronMan",
                "Tony Stark",
                "Marvel",
                "https://sm.ign.com/t/ign_es/screenshot/default/iron-man-marvel-regreso_hft3.1200.jpg"
            )
        )
    }
}