package com.example.newsapp.di.component

import com.example.newsapp.NewsApp
import com.example.newsapp.data.news.remote.NewsApiServices
import com.example.newsapp.views.MainActivity

import com.example.newsapp.di.module.NetworkModule
import com.example.newsapp.di.module.NewsDbModule
import dagger.Component
import dagger.Provides
import dagger.android.AndroidInjector
import retrofit2.Retrofit

@Component(modules = [NewsDbModule::class, NetworkModule::class])
interface NewsComponent :AndroidInjector<NewsApp>
    interface Builder {
        fun build(): NewsComponent

        fun newsDbModule(newsDbModule: NewsDbModule): Builder
        fun networkModule(networkModule: NetworkModule):Builder
    }

    //n inject(activity: MainActivity)


