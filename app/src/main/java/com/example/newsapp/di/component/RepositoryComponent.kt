package com.example.newsapp.di.component

import com.example.newsapp.MainActivity
import com.example.newsapp.Repository
import dagger.Component
@Component
interface RepositoryComponent {
    fun inject(Repository: Repository)
    @Component.Builder
    interface Builder {
        fun build(): RepositoryComponent
    }
}