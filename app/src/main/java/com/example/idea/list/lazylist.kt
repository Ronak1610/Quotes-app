package com.example.idea.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.idea.models.QuoteDetail


@Composable
    fun QuoteList(data:Array<QuoteDetail>,onClick: ()->Unit)
    {
        LazyColumn (content =  {
            items(data)
            {
                ScreenList(quote = it) {
                    onClick()
                }
            }
        })
    }

