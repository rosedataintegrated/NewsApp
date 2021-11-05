package com.example.newsapp.di.module

import android.content.Context
import androidx.room.Room
import com.example.newsapp.database.NewsDAO
import com.example.newsapp.database.NewsDatabase
import com.example.newsapp.database.NewsEntity
import dagger.Module
import dagger.Provides

@Module
class NewsDb (private val context: Context){

    @Provides
    internal fun provideDatabase(): NewsDatabase{
        return Room.databaseBuilder(
            context, NewsDatabase::class.java,"news.db"
        )
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration().build()
    }
}