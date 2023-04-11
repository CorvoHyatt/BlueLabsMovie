package com.corvolabs.bluelabsmovie.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.corvolabs.bluelabsmovie.R
import com.corvolabs.bluelabsmovie.databinding.ActivityMainBinding
import com.corvolabs.bluelabsmovie.ui.viewmodel.MovieViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val movieViewModel : MovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        movieViewModel.onCreate()
        setContentView(R.layout.activity_main)
    }
}