package com.example.androiddevchallenge.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun MySootheButton(modifier: Modifier = Modifier, onClick: () -> Unit, text: String, primary: Boolean = true) {
    if (primary) {
        Button(
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary, contentColor = MaterialTheme.colors.onPrimary),
            modifier =
            modifier
                .height(72.dp)
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.medium)
        ) {
            Text(text.toUpperCase())
        }
    } else {
        Button(
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondary, contentColor = MaterialTheme.colors.onSecondary),
            modifier =
            modifier
                .height(72.dp)
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.medium)
        ) {
            Text(text.toUpperCase())
        }
    }
}