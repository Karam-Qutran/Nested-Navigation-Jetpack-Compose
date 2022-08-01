package com.example.nested

sealed class Screens(val route : String){
    object AScreenRoute : Screens( route = "A")
    object BScreenRoute : Screens( route = "B")
    object OneScreenRoute : Screens( route = "1")
    object TowScreenRoute : Screens( route = "2")
    object LetterRoute : Screens( route = "Letter")
    object NumberRoute : Screens( route = "Letter")
}
