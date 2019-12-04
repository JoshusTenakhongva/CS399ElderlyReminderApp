package com.example.elderlyreminderapp.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is task page"
    }
    val text: LiveData<String> = _text
}