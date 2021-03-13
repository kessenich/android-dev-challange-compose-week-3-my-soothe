package com.example.androiddevchallenge.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.style.TextDecoration
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Surface(color = MaterialTheme.colors.background) {
        BackgroundImage()
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)) {
            Text("LOG IN", style = MaterialTheme.typography.h1.copy(color = MaterialTheme.colors.onBackground))
            Spacer(modifier = Modifier.height(32.dp))
            TextField(
                value = email,
                onValueChange = { email = it },
                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.onSurface),
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("Email address") },)
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = password,
                onValueChange = { password = it },
                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.onSurface),
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("Password") },
            )
            Spacer(modifier = Modifier.height(8.dp))
            MySootheButton(onClick = {}, text = "log in")
            Spacer(modifier = Modifier.height(32.dp))
            Row {
                Text("Don't have an account? ",
                    style = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.onBackground))
                Text("Sign up",
                    style = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.onBackground),
                    textDecoration = TextDecoration.Underline)
            }

        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LoginScreenLightPreview() {
    MyTheme {
        LoginScreen()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun LoginScreenDarkPreview() {
    MyTheme(darkTheme = true) {
        LoginScreen()
    }
}