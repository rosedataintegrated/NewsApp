package com.example.newsapp.di


import com.example.newsapp.MainActivity
import com.example.newsapp.di.module.NetworkModule
import com.example.newsapp.di.module.NewsDb


import dagger.Component

@Component(modules = [NewsDb::class, NetworkModule::class, NewsModule::class])
interface NewsComponent {
    fun inject(mainActivity: MainActivity)
    @Component.Builder
    interface Builder {

        fun build(): NewsComponent

        fun networkModule(networkModule: NetworkModule): Builder
        fun dbModule(NewsDb: NewsDb): Builder
    }}


