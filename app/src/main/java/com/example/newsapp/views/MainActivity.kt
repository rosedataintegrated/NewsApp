package com.example.newsapp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView

import com.example.newsapp.R
import com.example.newsapp.data.news.remote.Article
import com.example.newsapp.views.adapter.NewsListAdapter
import com.google.android.ads.mediationtestsuite.viewmodels.ViewModelFactory


class MainActivity : AppCompatActivity(), NewsListAdapter.NewsOnClickListener {
    private val TAG: String = MainActivity::class.simpleName!!

    //defining the list view property
    private lateinit var listView: RecyclerView
    var array = arrayOf("Article1", "Article2", "Article3")
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var adapter: NewsListAdapter

    private lateinit var newsViewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        // (applicationContext as NewsApp).appComponent.inject(this)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.news_list_view)

        //adapters
        //use arrayadapter and define an array

        adapter = NewsListAdapter(this, this)

        newsViewModel = ViewModelProvider(this).get(NewsViewModel::class.java)
        newsViewModel.getAllNews()
        newsViewModel.newsData.observe(this, {
            adapter.setNews(it)
        })
    }

    override fun onclick(article: Article) {
        Log.d(TAG, "onclick: ${article.title}")
    }


}


