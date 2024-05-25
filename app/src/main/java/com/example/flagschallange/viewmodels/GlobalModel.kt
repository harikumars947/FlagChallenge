package com.example.flagschallange.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class GlobalModel : ViewModel() {
    private val _score = MutableStateFlow(0)
    val globalVariable: StateFlow<Int> get() = _score

    fun updateGlobalVariable(newValue: Int) {
        _score.value = newValue
    }
}