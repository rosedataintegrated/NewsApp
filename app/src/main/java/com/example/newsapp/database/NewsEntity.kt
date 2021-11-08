package com.example.newsapp.database

import androidx.room.Entity

@Entity
data class NewsEntity(
    var nightId: Long = 0L,
    val startTimeMilli: Long = System.currentTimeMillis(),
    var endTimeMilli: Long = startTimeMilli,
    var sleepQuality: Int = -1
)
