package com.example.nested

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.nested.screens.AScreen
import com.example.nested.screens.BScreen


fun NavGraphBuilder.letterGraph(navController: NavController){

    val navigation = navigation(startDestination = "A", route = "letter") {

        composable(route = "A") {
            AScreen(navController)
        }
        composable(route = Screens.BScreenRoute.route) {
            BScreen(navController)
        }

    }
}

