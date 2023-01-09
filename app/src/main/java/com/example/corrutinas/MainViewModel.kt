package com.example.corrutinas

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var message by mutableStateOf("")
        private set

    fun llamarApi() {
        Thread.sleep(5000)
        message = "Mensaje Recibido!"
    }

}