package com.example.newsapp

import android.app.Application
import com.example.newsapp.di.component.DaggerNewsComponent

import com.example.newsapp.di.component.NewsComponent
import com.example.newsapp.di.module.NewsDbModule

open class NewsApp : Application() {
    lateinit var newsComponent: NewsComponent
    override fun onCreate() {
        super.onCreate()

        newsComponent = DaggerNewsComponent.builder()
            .newsDbModule(NewsDbModule(this))
            .build()
    }
}