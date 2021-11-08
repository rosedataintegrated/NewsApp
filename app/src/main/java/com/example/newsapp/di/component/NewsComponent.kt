package com.example.newsapp.di.component

import android.content.Context
import com.example.newsapp.views.MainActivity
import com.example.newsapp.di.module.NetworkModule
import com.example.newsapp.di.module.NewsDbModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [NewsDbModule::class, NetworkModule::class, NewsDbModule::class])
interface NewsComponent {
    @Component.Builder
    interface Builder {
        fun build(): NewsComponent
    }

    fun inject(activity: MainActivity)
}