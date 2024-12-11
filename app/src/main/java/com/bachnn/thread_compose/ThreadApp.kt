package com.bachnn.thread_compose

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bachnn.thread_compose.compose.screen.SplashScreen

@Composable
fun ThreadApp() {
    val navigation = rememberNavController()
    ThreadNavHost(navHost = navigation)
}


@Composable
fun ThreadNavHost(navHost: NavHostController) {
    NavHost(navController = navHost, startDestination = Screen.Splash.route) {
        composable(route = Screen.Splash.route) {
            // todo : launch splash screen check is login by google account
            // todo : if isn't login go to Login Screen else Home Screen.

            var isFirstTime by remember { mutableStateOf(true) }

            LaunchedEffect(Unit) {
                if (isFirstTime) {
                    isFirstTime = false
                }
            }

            if (isFirstTime) {
                isFirstTime = false
                SplashScreen(isLogin = {
                    // todo move login screen and home screen.
                })
            }

        }

        composable(route = Screen.Login.route) {

        }

        composable(route = Screen.Home.route) {

        }


    }
}