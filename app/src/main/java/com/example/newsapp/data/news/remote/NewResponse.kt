package com.example.newsapp.data.news.remote

data class NewResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)