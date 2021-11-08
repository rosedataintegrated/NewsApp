package com.example.newsapp.di.component

import android.content.Context
import com.example.newsapp.views.MainActivity
import com.example.newsapp.di.module.NetworkModule
import com.example.newsapp.di.module.NewsDbModule

@Component(modules = [NewsDbModule::class, NetworkModule::class, NewsDbModule::class])
interface newsComponent {
    @Component
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context)
    }

    fun inject(activity: MainActivity)
}