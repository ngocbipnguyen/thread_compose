package com.bachnn.thread_compose.compose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bachnn.thread_compose.R
import com.bachnn.thread_compose.viewModel.SplashViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
    viewModel: SplashViewModel = hiltViewModel(),
    isLogin: (Boolean) -> Unit
) {
    val isSplash = viewModel.splashState.observeAsState(initial = 0)

    Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
        ImageSplash(modifier = Modifier.padding(padding))

    }

    if (isSplash.value > 0) {
        if (isSplash.value == 1) {
            isLogin(true)
        } else {
            isLogin(false)
        }
    }
}

@Composable
fun ImageSplash(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(painter = painterResource(id = R.drawable.thread_icon), contentDescription = "")
    }
}