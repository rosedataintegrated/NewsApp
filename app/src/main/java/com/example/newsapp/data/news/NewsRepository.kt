package com.example.newsapp.data.news

import com.example.newsapp.data.news.local.NewsDAO

import com.example.newsapp.data.news.remote.NewsApiServices
import javax.inject.Inject

class NewsRepository
@Inject
constructor(
    private var remote: NewsApiServices,
    private var local: NewsDAO
) {
    // suspend fun getApps(appsRequest: AppsRequest) = NewsDAO.app(appsRequest)
}

class AppsRequest {

}
