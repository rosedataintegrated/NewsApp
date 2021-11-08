package com.example.newsapp.data.news

import com.example.newsapp.data.news.local.NewsDAO
import javax.inject.Inject

class NewsRepository
@Inject
constructor (
    private var remote: NewsRepository,
    private var local: NewsDAO
) {}
