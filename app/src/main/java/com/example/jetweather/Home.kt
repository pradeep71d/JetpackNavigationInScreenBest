package com.example.jetweather

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HomeData1(navController: NavHostController) {
    Column {
        Text(text = "Home Screen", fontSize = 34.sp)
        Spacer(modifier = Modifier.height(2.dp))
        Button(onClick = { navController.navigate("Second")}) {
            Text(text = "Go to Second", fontSize = 34.sp)
        }
    }
}