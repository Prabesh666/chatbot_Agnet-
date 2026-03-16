package com.cafeagents.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cafeagents.ui.login.LoginScreen
import com.cafeagents.ui.register.RegisterScreen
import com.cafeagents.ui.chat.ChatScreen
import com.cafeagents.ui.history.HistoryScreen
import com.cafeagents.ui.profile.ProfileScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
        composable("register") { RegisterScreen(navController) }
        composable("chat") { ChatScreen(navController) }
        composable("history") { HistoryScreen(navController) }
        composable("profile") { ProfileScreen(navController) }
    }
}
