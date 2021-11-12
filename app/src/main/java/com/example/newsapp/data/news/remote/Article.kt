package com.example.newsapp.data.news.remote

data class Article(

    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: SourceX,
    val title: String,
    val url: String,
    val urlToImage: String
)