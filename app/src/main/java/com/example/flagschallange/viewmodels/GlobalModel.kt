package com.example.flagschallange.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class GlobalModel : ViewModel() {
    private val _score = mutableStateOf(0)
    val globalVariable: MutableState<Int> get() = _score

    fun updateGlobalVariable(newValue: Int) {
        _score.value = newValue
    }
}