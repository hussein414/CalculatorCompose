package com.example.calculator.ui.view.state

import com.example.calculator.utils.CalculatorOperation

data class CalculatorState (
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null,
)