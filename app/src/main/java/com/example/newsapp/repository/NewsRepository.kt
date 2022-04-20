package com.example.newsapp.repository

import com.example.newsapp.api.RetrofitInstance
import com.example.newsapp.db.ArticleDatabase

class NewsRepository (val db: ArticleDatabase){
    suspend fun getBreakingNews(countyCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countyCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
}