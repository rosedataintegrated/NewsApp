package com.example.newsapp.data.news.remote

import com.example.newsapp.data.news.AppsRequest
import retrofit2.http.Body

interface NewsApiServices {
    fun apps(
        @Body
        apps: AppsRequest
    )
}