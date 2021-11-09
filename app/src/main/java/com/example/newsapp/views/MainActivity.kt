package com.example.newsapp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.newsapp.R

class MainActivity : AppCompatActivity() {
    //defining the list view property
    private lateinit var listView: ListView
    var array = arrayOf("Article1","Article2","Article3")


    override fun onCreate(savedInstanceState: Bundle?) {


        val adapter = ArrayAdapter(this,
            R.layout.listview_item, array)
        listView = findViewById <ListView> (R.id.news_list_view)
        listView.setAdapter(adapter)



        super.onCreate(savedInstanceState)
        // (applicationContext as NewsApp).appComponent.inject(this)
        setContentView(R.layout.activity_main)
        // val  newsEntity = NewsEntity((application as NewsEntity).newsEntity()
    }
}