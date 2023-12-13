package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var vm : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("AAA", "Activity created")

        vm = ViewModelProvider(this, MainViewModelFactory())
            .get(MainViewModel::class.java)

        setContentView(R.layout.activity_main)
        vm.resultLive.observe(this, Observer {
            val text = "text on click"
            vm.save(text)
        })


        println(vm.load("Load start"))
        println(vm.save("Save start"))
            // git@github.com:Tamer00775/androidhw5.git
    }
}