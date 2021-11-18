package com.example.newsapp.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newsapp.data.news.NewsRepository
import com.example.newsapp.views.adapter.ItemNewsViewModel
import java.lang.Exception
import javax.inject.Inject

class ViewModelFactory
@Inject
constructor(private val newsRepository: NewsRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ItemNewsViewModel::class.java)) {
            return ItemNewsViewModel(
                newsRepository
            ) as T
        }

        throw Exception("This is an unknown class, please use viewmodelfactory to create viewmodels")
    }
}