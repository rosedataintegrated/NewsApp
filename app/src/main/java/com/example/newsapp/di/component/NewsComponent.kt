package com.example.newsapp.di

import android.content.Context
import com.example.newsapp.MainActivity
import com.example.newsapp.di.module.NetworkModule
import com.example.newsapp.di.module.NewsDb
import dagger.BindsInstance

import dagger.Component

@Component(modules = [NewsDb::class, NetworkModule::class, newsModule::class])
interface newsComponent {
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context)
    }

    fun inject(activity: MainActivity)
}