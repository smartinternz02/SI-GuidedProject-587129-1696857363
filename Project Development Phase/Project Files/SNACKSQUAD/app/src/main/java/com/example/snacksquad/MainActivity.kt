@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.snacksquad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme{
                navController = rememberNavController()
                setupNavGraph(navController = navController)
            }
        }
    }
}



