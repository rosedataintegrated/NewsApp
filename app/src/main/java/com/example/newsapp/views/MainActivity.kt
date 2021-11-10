package com.example.newsapp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.newsapp.NewsAdapter
import com.example.newsapp.R

class MainActivity : AppCompatActivity() {
    //defining the list view property
    private lateinit var listView: ListView
    var array = arrayOf("Article1", "Article2", "Article3")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        // (applicationContext as NewsApp).appComponent.inject(this)
        setContentView(R.layout.activity_main)

        listView = findViewById<ListView>(R.id.news_list_view)
        val adapter = ArrayAdapter(
            this,
            R.layout.listview_item, array
        )

        //adapters
        //use arrayadapter and define an array


        //putting an event to listview
        listView.setOnItemClickListener { newsAdapterView, view, i, l ->
            val itemAtPos = newsAdapterView
        }
    }


}