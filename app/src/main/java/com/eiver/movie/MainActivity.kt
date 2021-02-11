package com.eiver.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eiver.movie.model.MoviesRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MoviesRepository.getPopularMovies()
    }
}