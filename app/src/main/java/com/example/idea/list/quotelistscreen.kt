package com.example.idea.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.idea.models.QuoteDetail

@Composable
fun QuotesListScreen(data: Array<QuoteDetail>,onClick:()-> Unit)

{
Column() {
    Text(text = "Quotes App",
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(8.dp, 24.dp),
        style = MaterialTheme.typography.titleMedium,
        fontFamily = FontFamily.SansSerif)
    QuoteList(data = data) {
        onClick()
    }
}
}


