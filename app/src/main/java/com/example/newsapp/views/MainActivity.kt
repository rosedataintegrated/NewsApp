package com.example.newsapp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView

import com.example.newsapp.R
import com.example.newsapp.data.news.remote.Article
import com.example.newsapp.databinding.ActivityMainBinding
import com.example.newsapp.utils.ViewModelFactory
import com.example.newsapp.views.adapter.ItemNewsViewModel
import com.example.newsapp.views.adapter.NewsListAdapter
import javax.inject.Inject


class MainActivity : AppCompatActivity(), NewsListAdapter.NewsOnClickListener {
    private val TAG: String = MainActivity::class.simpleName!!

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    //defining the list view property
    private lateinit var listView: RecyclerView
    var array = arrayOf("Article1", "Article2", "Article3")

    lateinit var binding: ActivityMainBinding

    private lateinit var adapter: NewsListAdapter

    private lateinit var itemNewsViewModel: ItemNewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        // (applicationContext as NewsApp).appComponent.inject(this)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.news_list_view)

        //adapters
        //use arrayadapter and define an array
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        adapter = NewsListAdapter(this, this)

        itemNewsViewModel = ViewModelProvider(this, viewModelFactory).get(ItemNewsViewModel::class.java)
        itemNewsViewModel.getAllNews()
        itemNewsViewModel.item.observe(this, {
            adapter.setNews(it)
        })
    }

    override fun onclick(article: Article) {
        Log.d(TAG, "onclick: ${article.title}")
    }


}


