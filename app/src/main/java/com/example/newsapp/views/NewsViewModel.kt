package com.example.newsapp.views


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newsapp.data.news.NewsRepository
import com.example.newsapp.data.news.remote.Article
import com.example.newsapp.data.news.remote.NewResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


abstract class NewsViewModel

constructor(private val newsRepository: NewsRepository)    : ViewModel() {

    val newsData: MutableLiveData<List<Article>> = MutableLiveData()

    private val disposable: CompositeDisposable = CompositeDisposable()

    fun getAllNews() {
        disposable.add(
            newsRepository.getAllNews()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    { newsResponse ->
                        newsData.value =newsResponse.articles
                    },
                    { throwable ->

                    }
                )
        )
    }
}