package com.example.newsapp.di.component

import com.example.newsapp.data.news.NewsRepository

@Component
interface RepositoryComponent {
    fun inject(Repository: NewsRepository)
    @Component.Builder
    interface Builder {
        fun build(): RepositoryComponent
    }
}