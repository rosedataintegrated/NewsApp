package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsapp.database.NewsEntity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var newsEntity: NewsEntity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // (applicationContext as NewsApp).appComponent.inject(this)
        setContentView(R.layout.activity_main)
     // val  newsEntity = NewsEntity((application as NewsEntity).newsEntity()
    }
}