package com.example.newsapp.repository

import com.example.newsapp.api.ApiService
import com.example.newsapp.db.ArticleDatabase
import com.example.newsapp.modles.Article

class NewsRepository (private val apiService: ApiService, private val db: ArticleDatabase){
    suspend fun getBreakingNews(countyCode: String, pageNumber: Int) =
        apiService.getBreakingNews(countyCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        apiService.searchForNews(searchQuery, pageNumber)

    suspend fun updateAndInsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}