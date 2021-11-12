package com.example.newsapp.data.news

import com.example.newsapp.data.news.local.NewsDAO
import com.example.newsapp.data.news.remote.NewResponse
import com.example.newsapp.data.news.remote.NewsApiServices
import io.reactivex.Observable
import javax.inject.Inject

class NewsRepository
@Inject
constructor(
    private var remote: NewsApiServices,
    private var local: NewsDAO
) {
    fun getAllNews(): Observable<NewResponse> = remote.getAllNews()
}
