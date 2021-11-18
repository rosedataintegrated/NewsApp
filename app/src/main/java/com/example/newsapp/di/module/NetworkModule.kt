package com.example.newsapp.di.module

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import com.example.newsapp.data.news.remote.NewsApiServices
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.Reusable
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import org.chromium.net.NetworkException
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Tag
import java.util.concurrent.TimeUnit

@Module
class NetworkModule {
    private val baseUrl: String = "https://newsapi.org/v2/"
    @Provides
    @Reusable
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
      //  val baseUrl = null
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Reusable
    fun provideOkHttpClient(): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        return OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
    }

    @Provides
    fun provideNewsApiService(retrofit: Retrofit): NewsApiServices {
        return retrofit.create(NewsApiServices::class.java)
    }


}