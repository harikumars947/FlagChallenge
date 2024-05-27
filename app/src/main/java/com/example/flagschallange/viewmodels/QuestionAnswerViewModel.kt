package com.example.flagschallange.viewmodels

import android.content.Context
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.example.RootQuestions
import com.google.gson.Gson
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.io.BufferedReader
import java.io.InputStreamReader

class QuestionAnswerViewModel : ViewModel() {
    val _timeLeft = mutableStateOf("00:00")
    var _isrunning = mutableStateOf(true)
    val timeLeft: MutableState<String> = _timeLeft
    var isTimerRunning: MutableState<Boolean> = _isrunning

    // Total time for the countdown in milliseconds
    var totalTime = 10 * 1000
    fun startTimer() {

        viewModelScope.launch {
            var timeMillis = totalTime
            while (timeMillis >= 0) {
                _timeLeft.value = formatTime(timeMillis.toLong())
                delay(1000) // Update every second
                timeMillis = timeMillis - 1000

            }
            _isrunning.value = false

        }

    }

    private fun formatTime(millis: Long): String {
        val seconds = millis / 1000
        val minutes = seconds / 60
        val remainingSeconds = seconds % 60
        return String.format("%02d:%02d", minutes, remainingSeconds)
    }

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