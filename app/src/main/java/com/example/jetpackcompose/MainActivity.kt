package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.app_layout.BadgeExample
import com.example.jetpackcompose.app_layout.BadgeInteractiveExample
import com.example.jetpackcompose.app_layout.PartialBottomSheet
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                    Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->

                        Column(
                            modifier = Modifier
                                .padding(contentPadding)
                                .fillMaxSize()
                                .padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(15.dp)
                        ) {
                            //Text Layout
//                            CustomText()
//                            TextShadow()
//                            MultipleStylesInText()
//                            CenterText()
//                            LongText()
//                            SimpleOutlinedTextFieldSample()
//                            PasswordTextField()
//                            NoLeadingZeroes()

                            //App layout
                            BadgeExample()
                            BadgeInteractiveExample()
                            PartialBottomSheet()
                        }
                    }
            }
        }
    }
}

