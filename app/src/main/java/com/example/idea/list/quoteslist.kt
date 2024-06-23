package com.example.idea.list

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.idea.DataManager
import com.example.idea.models.QuoteDetail



@Composable
fun ScreenList(quote: QuoteDetail, onClick :()-> Unit ) {
    Card(elevation =  CardDefaults.cardElevation(
        defaultElevation = 4.dp
    ), modifier = Modifier.clickable { onClick() }
        .padding(8.dp)

    )
        {
Row {
    Image(imageVector = Icons.Filled.Close,
        contentDescription ="icons",
        colorFilter = ColorFilter.tint(color = Color.White),
        alignment = Alignment.TopStart,
        modifier = Modifier
            .size(40.dp)
            .background(Color.Gray)
    )
    Spacer(modifier = Modifier.padding(4.dp))

    Column (modifier = Modifier.weight(1f))
    {

Text(text = quote.text,
    style = MaterialTheme.typography.bodyLarge,
    modifier = Modifier.padding(0.dp,0.dp,0.dp,8.dp)
)
        Box(modifier = Modifier
            .background(Color(0xFFEEEEEE))
            .fillMaxWidth(.4f)
            .height(30.dp)

        )
        {
Text(text = quote.author, modifier = Modifier.padding(top = 4.dp), style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Medium)
        }
    }
}
    }
}
































