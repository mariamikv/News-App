package com.example.newsapp.api.di

import com.example.newsapp.repository.NewsRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { NewsRepository(get(), get()) }
}