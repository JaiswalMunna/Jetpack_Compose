package com.example.jetpackcompose

import android.os.Bundle
import android.widget.HorizontalScrollView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.app_layout.AssistChipExample
import com.example.jetpackcompose.app_layout.BadgeExample
import com.example.jetpackcompose.app_layout.BadgeInteractiveExample
import com.example.jetpackcompose.app_layout.CardMinimalExample
import com.example.jetpackcompose.app_layout.CheckboxMinimalExample
import com.example.jetpackcompose.app_layout.CheckboxParentExample
import com.example.jetpackcompose.app_layout.ElevatedButtonExample
import com.example.jetpackcompose.app_layout.ElevatedCardExample
import com.example.jetpackcompose.app_layout.FilledButtonExample
import com.example.jetpackcompose.app_layout.FilledCardExample
import com.example.jetpackcompose.app_layout.FilledTonalButtonExample
import com.example.jetpackcompose.app_layout.FilterChipExample
import com.example.jetpackcompose.app_layout.InputChipExample
import com.example.jetpackcompose.app_layout.OutlinedButtonExample
import com.example.jetpackcompose.app_layout.OutlinedCardExample
import com.example.jetpackcompose.app_layout.PartialBottomSheet
import com.example.jetpackcompose.app_layout.TextButtonExample
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
//                        BadgeExample()
//                        BadgeInteractiveExample()
//                        PartialBottomSheet()
                    }

//                    Row (
//                        modifier = Modifier
//                            .padding(contentPadding)
//                            .fillMaxSize()
//                            .padding(16.dp)
//                            .horizontalScroll(rememberScrollState()),
//                        horizontalArrangement = Arrangement.spacedBy(15.dp)
//                    ){
//                        FilledButtonExample()
//                        FilledTonalButtonExample()
//                        OutlinedButtonExample()
//                        ElevatedButtonExample()
//                        TextButtonExample()
//                    }
                    Column (modifier = Modifier.padding(15.dp)){
//                        CardMinimalExample()
//                        FilledCardExample()
//                        ElevatedCardExample()
//                        OutlinedCardExample()

//                        CheckboxMinimalExample()
//                        CheckboxParentExample()

                        AssistChipExample()
                        FilterChipExample()
                        InputChipExample(text = "Munna")
                    }

                }
            }
        }
    }
}


