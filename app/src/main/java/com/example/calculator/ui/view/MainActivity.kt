package com.example.calculator.ui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculator.ui.theme.CalculatorTheme
import com.example.calculator.ui.theme.MediumGray
import com.example.calculator.ui.view.component.CalculatorScreen
import com.example.calculator.ui.view.viewmodel.CalculatorViewModel
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                val systemUiController = rememberSystemUiController()
                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = Color.DarkGray,
                        darkIcons = false
                    )
                }
                // A surface container using the 'background' color from the theme
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                CalculatorScreen(
                    state = state,
                    onAction = viewModel::onAction,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            MediumGray
                        )
                        .padding(16.dp)
                )
            }
        }
    }
}

