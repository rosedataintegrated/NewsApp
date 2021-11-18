package com.example.newsapp.data.news.remote

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName


data class NewResponse(
    @SerializedNameName
    val articles: List<Article>,

    val status: String?,

    val totalResults: Int
)

annotation class SerializedNameName
