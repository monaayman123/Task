package com.example.task


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ContentAlpha
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.task.ui.theme.TaskTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {


                          MyBottomNavigation()

                }
            }
        }
    }
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyBottomNavigation() {

    val items= listOf(Screen.HomeScreen,Screen.ProfileScreen,Screen.SearchScreen,Screen.SettingScreen)
    val navController= rememberNavController()

    Scaffold(

       bottomBar = {
      BottomNavigation (){

          val naveBackStackEntry by  navController.currentBackStackEntryAsState()
          val currentRoute=naveBackStackEntry?.destination?.route
          items.forEach { screen ->
              BottomNavigationItem(modifier =Modifier.
                  background(Color(0xFF8CB3D3)),
                  selected = currentRoute == screen.route,
                  label = {
                      Text(
                          text = if(currentRoute==screen.route)screen.title else "",
                          color =  Color.White
                      ) },


//                  unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
                  icon = { Icon(modifier = Modifier.background(shape = RoundedCornerShape(6.dp),color =
                  if(currentRoute==screen.route) Color(0xFF1432DA) else Color(0xFF8CB3D3)
                  ).padding(8.dp),
                      imageVector = screen.icon,
                      contentDescription = null,
                      tint = if(currentRoute==screen.route) Color.White else Color.Gray
                  ) },
                  onClick = {

                      navController.navigate(screen.route) {
                          popUpTo(navController.graph.findStartDestination().id){
                              saveState=true
                          }
                          launchSingleTop=true
                          restoreState=true
                      }

                  })

          }}}
   ){

            Nav(navController = navController)
        }
}




