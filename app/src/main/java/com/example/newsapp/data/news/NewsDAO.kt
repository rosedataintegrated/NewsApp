package com.example.newsapp.data.news

import androidx.room.Dao

@Dao
interface NewsDAO {


    fun insert(article: NewsEntity)


    fun  update(article: NewsEntity)


    fun delete(article: NewsEntity)

    fun get(key: Long): NewsEntity?




}