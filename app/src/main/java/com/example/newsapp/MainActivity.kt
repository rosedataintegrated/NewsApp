package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsapp.database.NewsEntity
import com.example.newsapp.di.NewsComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var newsComponent: NewsComponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // (applicationContext as NewsApp).appComponent.inject(this)
        setContentView(R.layout.activity_main)
     //val  newsComponent = NewsComponent((application as NewsEntity).newsEntity()
    }
}