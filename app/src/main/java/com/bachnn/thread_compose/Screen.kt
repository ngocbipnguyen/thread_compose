package com.bachnn.thread_compose

import androidx.navigation.NamedNavArgument

sealed class Screen(val route: String, val arguments : List<NamedNavArgument> = emptyList()) {

    object Splash: Screen("Splash")
    object Login: Screen("Login")
    object Home: Screen("Home")

}