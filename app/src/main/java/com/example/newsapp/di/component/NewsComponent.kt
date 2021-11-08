package com.example.newsapp.di.component

import com.example.newsapp.views.MainActivity

import com.example.newsapp.di.module.NetworkModule
import com.example.newsapp.di.module.NewsDbModule
import dagger.Component

@Component(modules = [NewsDbModule::class, NetworkModule::class])
interface NewsComponent {

    @Component.Builder
    interface Builder {
        fun build(): NewsComponent

        fun newsDbModule(newsDbModule: NewsDbModule): Builder
    }

    fun inject(activity: MainActivity)
}