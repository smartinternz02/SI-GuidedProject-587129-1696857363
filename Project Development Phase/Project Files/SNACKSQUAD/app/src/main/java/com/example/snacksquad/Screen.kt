package com.example.snacksquad

sealed class Screen(val route:String) {
    object OpeningScreen:Screen(route="opening_screen")
    object HomeScreen:Screen(route="home_screen")
    object Snacks:Screen(route="snacks_screen")
    object Register:Screen(route="register_screen")
    object Cart:Screen(route="cart_screen")
    object Payment:Screen(route="payment_screen")


}
