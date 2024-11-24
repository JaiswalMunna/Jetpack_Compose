package com.example.jetpackcompose

import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomText() {
    Text("Hello dear", style = TextStyle(color = Color.Red))
}

@Composable
fun TextShadow() {
    val offset = Offset(5.0f, 10.0f)
    Text(
        text = "Hello world!", style = TextStyle(
            fontSize = 24.sp, shadow = Shadow(
                color = Color.Blue, offset = offset, blurRadius = 3f
            )
        )
    )
}

@Composable
fun MultipleStylesInText() {
    Text(buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color.Blue)) {
            append("H")
        }
        append("ello ")

        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
            append("W")
        }
        append("orld")
    })
}

@Composable
fun CenterText() {
    Text("Hello World", textAlign = TextAlign.Center, modifier = Modifier.width(150.dp))
}