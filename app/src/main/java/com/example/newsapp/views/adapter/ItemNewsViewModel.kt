package com.example.newsapp.views.adapter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newsapp.data.news.remote.Article

class ItemNewsViewModel: ViewModel() {
    private val item: MutableLiveData<String> = MutableLiveData()
    fun bind(article: Article) {
        item.value
    }
}