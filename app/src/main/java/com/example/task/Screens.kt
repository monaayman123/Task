package com.example.task


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen (val route:String ,val title:String,val icon:ImageVector){
    object HomeScreen:Screen(
        "home",
        "Home",
        Icons.Default.Home
    )
    object SearchScreen:Screen(
        "search",
        "Search",
       icon=Icons.Default.Search

    )
    object ProfileScreen:Screen(
        "profile",
        "Profile",
        Icons.Default.Person
    )
    object SettingScreen:Screen(
        "setting",
        "Setting",
        Icons.Default.Settings
    )
}