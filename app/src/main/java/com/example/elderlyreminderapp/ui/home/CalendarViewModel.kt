package com.example.elderlyreminderapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalendarViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is calendar page"
    }
    val text: LiveData<String> = _text
}