package com.example.idea.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.idea.models.QuoteDetail



@Composable
fun Quotes(quote: QuoteDetail) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFffffff),
                        Color(0xFFE3E3E3)

                    )
                )
            )

    )
    {
        Card(elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier.padding(33.dp),
            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.onErrorContainer)
        , )


        {
            Column (verticalArrangement = Arrangement.Center, modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp, 24.dp)
            )
            {
                Image(imageVector = Icons.Filled.CheckCircle, contentDescription = "",colorFilter = ColorFilter.tint(color = Color.White), modifier = Modifier
                    .size(80.dp)
                    .background(Color.Gray))
                Spacer(modifier = Modifier.padding(10.dp))
                Text(text = quote.text,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = quote.author,
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.DarkGray
                )


            }
        }
    }


}





