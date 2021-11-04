package com.example.newsapp.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [NewsEntity::class], version = 1, exportSchema = false)
abstract class NewsAbstract: RoomDatabase(){
    abstract val newsInterface: NewsInterface
}