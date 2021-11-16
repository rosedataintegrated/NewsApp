package com.example.newsapp.views.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import com.example.newsapp.data.news.remote.Article
import com.example.newsapp.databinding.NewsItemBinding

import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.data.news.remote.NewResponse

class NewsListAdapter(
   @NewResponse.SerializeName
    private val context: Context,
    private val onItemClickListener: NewsOnClickListener
) : RecyclerView.Adapter<NewsViewHolder>() {
    private var newsList: List<Article> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val binding = NewsItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return NewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(newsList.get(position))
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    fun setNews(newsList: List<Article>) {
        this.newsList = newsList
        notifyDataSetChanged()
    }

    interface NewsOnClickListener {
        fun onclick(article: Article)
    }
}