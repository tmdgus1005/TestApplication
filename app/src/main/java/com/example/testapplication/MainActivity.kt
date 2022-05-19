package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mainBinding:ActivityMainBinding?=null
    private val binding get() = mainBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}