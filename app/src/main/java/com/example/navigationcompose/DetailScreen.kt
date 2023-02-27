package com.example.navigationcompose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.navigation.Screen

@Composable
fun DetailScreen(
    navController: NavController
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = "Detail",
            color = MaterialTheme.colors.secondary,
            style = MaterialTheme.typography.h3,
            fontWeight = FontWeight.Bold,
            //modifier = Modifier.clickable { navController.popBackStack() }
            modifier = Modifier.clickable {
                navController.navigate(Screen.Home.route) {
                    popUpTo(route = Screen.Home.route) {
                        inclusive = true
                    }
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen(
        navController = rememberNavController()
    )
}