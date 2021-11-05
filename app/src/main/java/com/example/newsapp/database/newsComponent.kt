package com.example.newsapp.database

import android.content.Context
import com.example.newsapp.MainActivity
import dagger.BindsInstance

import dagger.Component

@Component(modules = [newsModule::class])
interface newsComponent {
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context)
    }

    fun inject(activity: MainActivity)
}