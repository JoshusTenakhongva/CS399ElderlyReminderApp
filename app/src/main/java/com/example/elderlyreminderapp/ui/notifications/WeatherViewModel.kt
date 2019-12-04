package com.example.elderlyreminderapp.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WeatherViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is weather page"
    }
    val text: LiveData<String> = _text
}