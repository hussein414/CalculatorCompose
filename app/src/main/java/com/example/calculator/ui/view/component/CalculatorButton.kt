package com.example.calculator.ui.view.component

import android.service.autofill.OnClickAction
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.DateFormatSymbols

@Composable
fun CalculatorButton(
    symbols: String,
    modifier: Modifier,
    onClick: () -> Unit
) {
    Box(modifier = Modifier
        .clip(CircleShape)
        .clickable { onClick() }
        .then(modifier),
        contentAlignment = Alignment.Center) {
        Text(
            text = symbols,
            fontSize = 36.sp,
            color = Color.White
        )
    }
}

@Preview
@Composable
fun CalculatorButtonPreview() {
    CalculatorButton(symbols = "1", modifier =Modifier.size(50.dp).background(Color.Gray) ) {

    }
}