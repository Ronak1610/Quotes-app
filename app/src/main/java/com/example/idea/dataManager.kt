package com.example.idea

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.idea.models.QuoteDetail
import com.google.gson.Gson


object DataManager
{
    var data = emptyArray<QuoteDetail>()
    var isDataLoaded = mutableStateOf(false)
    fun loadAssistsFromFile(context: Context)
    {
val inputStream = context.assets.open("quotes.json")
        val size : Int= inputStream.available()
        val buffer= ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data= gson.fromJson(json, Array<QuoteDetail>::class.java)
        isDataLoaded.value=true
    }
}