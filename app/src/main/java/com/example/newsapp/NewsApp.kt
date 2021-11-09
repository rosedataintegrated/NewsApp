package com.example.newsapp

import android.app.Application
import com.example.newsapp.di.component.DaggerNewsComponent
import com.example.newsapp.di.component.NewsComponent
import com.example.newsapp.di.module.NewsDbModule

class NewsApp : Application() {
    lateinit var newsAppComponent: NewsComponent
    override fun onCreate() {
        super.onCreate()

        newsAppComponent = DaggerNewsComponent.builder()
            .newsDbModule(NewsDbModule(this))
            .build()
    }
}