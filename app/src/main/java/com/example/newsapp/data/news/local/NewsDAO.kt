package com.example.newsapp.data.news.local

import androidx.room.*
import com.example.newsapp.data.news.remote.NewResponse

@Dao
interface NewsDAO {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(article: NewsEntity)

    @Update
    fun update(article: NewsEntity)

    @Delete
    fun delete(article: NewsEntity)

   // @Query("Select * from NewsEntity where nightId = :key")
   // fun get(key: Long): NewsEntity?

    @Query("SELECT * FROM 'NewsEntity' order by 'published_at' desc")
fun getNews(): List<NewResponse>



}

annotation class RewriteQueries
