package com.example.newsapp.api.di

import com.example.newsapp.view_models.NewsViewModel
import com.example.newsapp.view_models.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { NewsViewModel(get()) }
    viewModel { SearchViewModel(get()) }
}