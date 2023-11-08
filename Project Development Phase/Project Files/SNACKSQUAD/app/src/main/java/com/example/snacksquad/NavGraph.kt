package com.example.snacksquad

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun setupNavGraph(
    navController: NavHostController
)
{
    NavHost(
        navController = navController,
        startDestination = Screen.OpeningScreen.route)
    {

        composable(
            route = Screen.OpeningScreen.route,
        )
        {
            OpeningScreen(navController = navController)
        }

        composable(
            route = Screen.HomeScreen.route
        )
        {
            HomeScreen(navController = navController)
        }

        composable(
            route = Screen.Register.route
        )
        {
            Register(navController = navController)
        }

        composable(
            route = Screen.Snacks.route
        )
        {
            Snacks(navController = navController)
        }

        composable(
            route = Screen.Cart.route
        )
        {
            Cart(navController = navController)
        }

        composable(
            route = Screen.Payment.route
        )
        {
            Payment(navController = navController)
        }

    }
}