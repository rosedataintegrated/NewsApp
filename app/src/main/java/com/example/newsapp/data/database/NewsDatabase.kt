package com.example.newsapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.newsapp.data.news.NewsDAO
import com.example.newsapp.data.news.NewsEntity

@Database(entities = [NewsEntity::class], version = 1, exportSchema = false)
abstract class NewsDatabase: RoomDatabase(){
    abstract val newsInterface: NewsDAO
}
