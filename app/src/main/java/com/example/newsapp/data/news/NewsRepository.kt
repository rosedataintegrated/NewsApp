package com.example.newsapp.data.news

import com.example.newsapp.data.news.NewsEntity
import javax.inject.Inject

class NewsRepository
@Inject
constructor (
    private val localDataSource: NewsEntity
) {}
