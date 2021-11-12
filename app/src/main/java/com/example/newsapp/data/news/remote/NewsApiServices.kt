package com.example.newsapp.data.news.remote

import com.example.newsapp.utils.Constants.API_KEY
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface NewsApiServices {
    @GET("everything")

    fun getAllNews(
        @Query("q") q: String = "Apple",
        @Query("apiKey") apiKey: String = API_KEY
    ): Observable<NewResponse>
}