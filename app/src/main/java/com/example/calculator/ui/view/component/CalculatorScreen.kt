package com.example.calculator.ui.view.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.LightGray
import com.example.calculator.ui.theme.Orange
import com.example.calculator.ui.view.state.CalculatorState
import com.example.calculator.utils.CalculatorAction
import com.example.calculator.utils.CalculatorOperation
import com.example.calculator.utils.Constance.ButtonSpacing

@Composable
fun CalculatorScreen(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    onAction: (CalculatorAction) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(ButtonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbols ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(ButtonSpacing)
            ) {
                CalculatorButton(
                    symbols = "AC",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(2f)
                        .weight(2f), onClick = {
                        onAction(CalculatorAction.Clear)
                    }
                )
                CalculatorButton(
                    symbols = "Del",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Delete)
                    }
                )
                CalculatorButton(
                    symbols = "/",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                    }
                )
            }
            Spacer(modifier = Modifier.height(ButtonSpacing))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(ButtonSpacing)
            ) {
                CalculatorButton(
                    symbols = "7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Number(7))
                    }
                )
                CalculatorButton(
                    symbols = "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Number(8))
                    }
                )
                CalculatorButton(
                    symbols = "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Number(9))
                    }
                )

                CalculatorButton(
                    symbols = "X",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                    }
                )
            }
            Spacer(modifier = Modifier.height(ButtonSpacing))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(ButtonSpacing)
            ) {
                CalculatorButton(
                    symbols = "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Number(4))
                    }
                )
                CalculatorButton(
                    symbols = "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Number(5))
                    }
                )
                CalculatorButton(
                    symbols = "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Number(6))
                    }
                )

                CalculatorButton(
                    symbols = "-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                    }
                )
            }
            Spacer(modifier = Modifier.height(ButtonSpacing))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(ButtonSpacing)
            ) {
                CalculatorButton(
                    symbols = "1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Number(1))
                    }
                )
                CalculatorButton(
                    symbols = "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Number(2))
                    }
                )
                CalculatorButton(
                    symbols = "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Number(3))
                    }
                )

                CalculatorButton(
                    symbols = "+",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                    }
                )
            }
            Spacer(modifier = Modifier.height(ButtonSpacing))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(ButtonSpacing)
            ) {
                CalculatorButton(
                    symbols = "0",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f), onClick = {
                        onAction(CalculatorAction.Number(0))
                    }
                )
                CalculatorButton(
                    symbols = ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(
                    symbols = "=",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction(CalculatorAction.Calculate)
                    }
                )
            }
        }
    }

}


@Preview
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun CalculatorScreenPreview() {
    CalculatorScreen(state = CalculatorState(), onAction = {})
}