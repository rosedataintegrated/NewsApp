package com.example.newsapp.views.adapter

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newsapp.data.news.NewsRepository
import com.example.newsapp.data.news.remote.Article
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import java.util.*
import javax.inject.Inject

class ItemNewsViewModel
@Inject
constructor(private val newsRepository: NewsRepository) : ViewModel(){
    private val TAG = ItemNewsViewModel::class.java.simpleName

    val item: MutableLiveData<List<Article>> = MutableLiveData()

    fun bind(article: Article) {
        item.value
    }
    //val item: MutableLiveData<List<Article>> = MutableLiveData()

    private val disposable: CompositeDisposable = CompositeDisposable()

    fun getAllNews() {
        disposable.add(
            newsRepository.getAllNews()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    { newsResponse ->
                       // Log.d(TAG, newsResponse.articles.toString())
                        item.value = newsResponse.articles.toList()
                    },
                    { throwable ->

                    }
                )
        )
    }
}