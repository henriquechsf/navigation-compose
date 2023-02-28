package com.example.navigationcompose.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.navigationcompose.navigation.HOME_ROUTE
import com.example.navigationcompose.navigation.ROOT_ROUTE
import com.example.navigationcompose.navigation.Screen

@Composable
fun SetupNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {
        // nested navigation
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }
}