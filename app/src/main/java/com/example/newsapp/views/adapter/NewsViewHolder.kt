package com.example.newsapp.views.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.data.news.NewsRepository
import com.example.newsapp.data.news.remote.Article
import com.example.newsapp.databinding.NewsItemBinding
import com.example.newsapp.views.NewsViewModel

class NewsViewHolder(private val binding: NewsItemBinding): RecyclerView.ViewHolder(binding.root) {


    fun bind(article: Article) {
     //   viewModel.bind(article)

        binding.tvTitle.text = article.title
    }
}