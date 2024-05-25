package com.example.flagschallange.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.example.RootQuestions
import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader

class QuestionAnswerViewModel: ViewModel() {

    /*fun questions(context: Context): RootQuestions? {
        if (user == null) {
            user = readJsonFromAssets(context, "data.json")
        }
        return user
    }*/

     fun readJsonFromAssets(context: Context, fileName: String): RootQuestions? {
        return try {
            val inputStream = context.assets.open(fileName)
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
            val jsonString = bufferedReader.use { it.readText() }
            Gson().fromJson(jsonString, RootQuestions::class.java)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}