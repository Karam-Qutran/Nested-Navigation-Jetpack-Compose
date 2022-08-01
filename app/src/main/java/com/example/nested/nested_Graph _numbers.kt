package com.example.nested

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.nested.screens.OneScreen
import com.example.nested.screens.TwoScreen

fun NavGraphBuilder.numberGraph(navController: NavController){

    navigation(startDestination = "one" , route = "number"){

        composable( route = "one" ){
            OneScreen(navController)
        }
        composable( route = "two" ){
            TwoScreen(navController)
        }

    }
}