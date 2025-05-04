package com.koaledu.calculatrice.ui.stopwatch

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StopwatchViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Fragment de cronómetro"
    }
    val text: LiveData<String> = _text
}