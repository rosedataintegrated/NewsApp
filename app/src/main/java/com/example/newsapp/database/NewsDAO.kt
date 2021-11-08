package com.example.newsapp.database

import androidx.lifecycle.LiveData
import androidx.room.*
import retrofit2.http.GET
import retrofit2.http.Query


@Dao

interface NewsDAO {

  //@Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNewsEntity (newsEntity:NewsEntity)

    fun  update(newsEntity:NewsEntity)

    fun delete(newsEntity:NewsEntity)

    fun get(key: Long): NewsEntity?




}


