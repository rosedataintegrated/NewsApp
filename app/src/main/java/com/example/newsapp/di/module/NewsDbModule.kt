package com.example.newsapp.di.module

import android.content.Context
import androidx.room.Room
import com.example.newsapp.data.database.NewsDatabase
import dagger.Component
import dagger.Module
import dagger.Provides

@Module
class NewsDbModule (private val context: Context){
   // @Component.Builder restModule(NewsModule restModule)
    @Provides
    internal fun provideDatabase(): NewsDatabase{
        return Room.databaseBuilder(
            context, NewsDatabase::class.java,"news.db"
        )
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration().build()
    }
}