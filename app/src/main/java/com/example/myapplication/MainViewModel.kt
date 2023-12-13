package com.example.myapplication

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val getUserNameUseCase: String,
                    private val saveUserNameUseCase: String)
    : ViewModel() {
    var resultLiveMutable  = MutableLiveData<String>()
    val resultLive: LiveData<String> = resultLiveMutable
    init {
        Log.e("AAA", "VM created")
    }



    override fun onCleared() {
        Log.e("AAA", "VM cleared")
        super.onCleared()
    }

    fun save(text: String) {
        resultLiveMutable.value = "saved"
    }

    fun load(text: String) {
        resultLiveMutable.value = "load"
    }
}