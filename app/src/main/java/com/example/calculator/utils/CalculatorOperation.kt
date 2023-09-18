package com.example.calculator.utils

import java.text.DateFormatSymbols

sealed class CalculatorOperation(val symbols: String) {
    object Add : CalculatorOperation(symbols = "+")
    object Subtract : CalculatorOperation(symbols = "-")
    object Multiply : CalculatorOperation(symbols = "x")
    object Divide : CalculatorOperation(symbols = "/")

}
