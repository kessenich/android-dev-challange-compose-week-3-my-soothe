package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.androiddevchallenge.R

@Composable
fun WelcomeLogoImage() {
    if (isSystemInDarkTheme()) {
        Image(painterResource(R.drawable.dark_logo),"logo")
    } else {
        Image(painterResource(R.drawable.light_logo),"logo")
    }
}

@Composable
fun WelcomeBackgroundImage() {
    if (isSystemInDarkTheme()) {
        Image(painterResource(R.drawable.dark_welcome),null, modifier = Modifier.fillMaxSize())
    } else {
        Image(painterResource(R.drawable.light_welcome),null, modifier = Modifier.fillMaxSize())
    }
}

@Composable
fun BackgroundImage() {
    if (isSystemInDarkTheme()) {
        Image(painterResource(R.drawable.dark_login),null, modifier = Modifier.fillMaxSize())
    } else {
        Image(painterResource(R.drawable.light_login),null, modifier = Modifier.fillMaxSize())
    }
}
