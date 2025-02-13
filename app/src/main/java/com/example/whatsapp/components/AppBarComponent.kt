package com.example.whatsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AppBarComponent(modifier: Modifier = Modifier) {
    Row (modifier = Modifier
        .height(60.dp)
        .fillMaxWidth()
        .background(if(isSystemInDarkTheme()) Color.Gray else Color.Green)
    ) {

    }
}

@Preview
@Composable
private fun AppBarComponentPreview() {
    AppBarComponent()
}