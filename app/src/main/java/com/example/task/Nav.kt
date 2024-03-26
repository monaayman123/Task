package com.example.task

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.task.Screens.HomeScreen
import com.example.task.Screens.ProfileScreen
import com.example.task.Screens.SearchScreen
import com.example.task.Screens.SettingScreen

@Composable
fun Nav(navController: NavHostController) {



    NavHost(navController = navController, startDestination =Screen.HomeScreen.route ) {

        composable(Screen.HomeScreen.route){
            HomeScreen()
        }
        composable(Screen.SearchScreen.route){
        SearchScreen()
        }
        composable(Screen.SettingScreen.route){
            SettingScreen()
        }
        composable(Screen.ProfileScreen.route){
           ProfileScreen()
        }
    }

}


