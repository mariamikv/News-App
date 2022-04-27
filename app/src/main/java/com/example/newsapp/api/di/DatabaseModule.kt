package com.example.newsapp.api.di

import com.example.newsapp.db.ArticleDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val databaseModule = module {
    single { ArticleDatabase(androidApplication()) }
}