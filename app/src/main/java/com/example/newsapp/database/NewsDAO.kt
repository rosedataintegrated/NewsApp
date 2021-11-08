package com.example.newsapp.database

import androidx.room.Dao
import androidx.room.Query

@Dao
interface NewsDAO {


    fun insert(article:NewsEntity)


    fun  update(article:NewsEntity)


    fun delete(article:NewsEntity)

    fun get(key: Long): NewsEntity?




}