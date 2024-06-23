package com.example.idea

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.idea.list.QuoteList
import com.example.idea.list.Quotes
import com.example.idea.list.QuotesListScreen
import com.example.idea.list.ScreenList


import com.example.idea.ui.theme.IdeaTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoroutineScope(Dispatchers.IO).launch {
           DataManager.loadAssistsFromFile(applicationContext)
            delay(1000)
        }
        enableEdgeToEdge()
        setContent {
            IdeaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

App(modifier = Modifier.padding(innerPadding) )


                }
            }
        }
    }

}

@Composable
fun App(modifier: Modifier) {
  if (DataManager.isDataLoaded.value)
  {
      QuotesListScreen(data = DataManager.data) {
      }

  }
    else{
        Text("Loading.......", textAlign = TextAlign.Center, fontStyle = FontStyle.Italic)

  }
}

