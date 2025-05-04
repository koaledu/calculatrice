package com.koaledu.calculatrice.ui.calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Fragment de calculadora"
    }
    val text: LiveData<String> = _text
}