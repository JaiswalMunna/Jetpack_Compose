package com.example.jetpackcompose.app_layout

import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

@Composable
fun FilledButtonExample(
//    onClick: () -> Unit
) {
    Button(onClick = {
//        onClick()
    }) {
        Text("Filled")
    }
}

@Composable
fun FilledTonalButtonExample(
//    onClick: () -> Unit
) {
    FilledTonalButton(
        onClick = {
//            onClick()
        }) {
        Text("Tonal")
    }
}

@Composable
fun OutlinedButtonExample(
//    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = {
//            onClick()
        }) {
        Text("Outlined")
    }
}

@Composable
fun ElevatedButtonExample(
//    onClick: () -> Unit
) {
    ElevatedButton(onClick = {
//        onClick()
    }) {
        Text("Elevated")
    }
}

@Composable
fun TextButtonExample(
//    onClick: () -> Unit
) {
    TextButton(
        onClick = {
//            onClick()
        }
    ) {
        Text("Text Button")
    }
}