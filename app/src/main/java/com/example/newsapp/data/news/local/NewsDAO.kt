package com.example.newsapp.data.news.local

import androidx.room.*

@Dao
interface NewsDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(article: NewsEntity)

    @Update
    fun  update(article: NewsEntity)

    @Delete
    fun delete(article: NewsEntity)

    @Query("Select * from newsentity where nightId = :key")
    fun get(key: Long): NewsEntity?




}