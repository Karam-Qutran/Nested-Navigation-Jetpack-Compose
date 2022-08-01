package com.example.nested

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.nested.screens.AScreen
import com.example.nested.screens.BScreen
import com.example.nested.screens.OneScreen
import com.example.nested.screens.TwoScreen

@Composable
fun Nav() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "number"  ){

        numberGraph(navController)

        letterGraph(navController)

    }
}