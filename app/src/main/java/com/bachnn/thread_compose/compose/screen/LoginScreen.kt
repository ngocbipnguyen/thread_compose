package com.bachnn.thread_compose.compose.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bachnn.thread_compose.viewModel.LoginViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel = hiltViewModel(),
    moveScreen: (Boolean) -> Unit
) {
    Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
        LoginView(modifier = modifier.padding(padding), viewModel, moveScreen)
    }
}

@Composable
fun LoginView(
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel,
    onLoginEvent: (Boolean) -> Unit
) {
    Box {
        ImageSplash()
        FilledTonalButton(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(16.dp)
        ) {
            Text(
                text = "Sign in by Google",
                style = TextStyle(color = Color.White, fontSize = 20.sp)
            )
        }
    }
}
