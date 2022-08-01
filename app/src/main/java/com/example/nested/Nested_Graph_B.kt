package com.example.nested

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.nested.screens.BScreen

fun NavGraphBuilder.bGraph(navController: NavController){

    navigation( startDestination = "B", route = "bb"){

        composable("B"){
            BScreen(navController)
        }

    }
}