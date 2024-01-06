package com.example.jetweather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetweather.ui.theme.JetWeatherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetWeatherTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "Home") {
                    //we need to create composable (Screens),route inside navhost
                    composable("Home") {
                        //give the route name of each screen
                        HomeData1(navController)
                    } //here composable are screens funs.
                    composable("Second") {
                        SecondData(navController)
                    }
                    composable("Third") {
                        ThirdData(navController)
                    }
                }
            }
        }
    }
}
