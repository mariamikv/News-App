package com.example.newsapp.view_models

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newsapp.app.App
import com.example.newsapp.repository.NewsRepository

class NewsViewModelProviderFactory(val newsRepository: NewsRepository, val app: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository, app) as T
    }
}