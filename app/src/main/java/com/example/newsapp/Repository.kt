package com.example.newsapp

import com.example.newsapp.database.NewsEntity
import javax.inject.Inject

class Repository@Inject constructor (private val localDataSource: NewsEntity,
                                     )
{}