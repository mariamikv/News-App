package com.example.newsapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00160\u0015J\'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/newsapp/repository/NewsRepository;", "", "apiService", "Lcom/example/newsapp/api/ApiService;", "db", "Lcom/example/newsapp/db/ArticleDatabase;", "(Lcom/example/newsapp/api/ApiService;Lcom/example/newsapp/db/ArticleDatabase;)V", "deleteArticle", "", "article", "Lcom/example/newsapp/modles/Article;", "(Lcom/example/newsapp/modles/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBreakingNews", "Lretrofit2/Response;", "Lcom/example/newsapp/modles/NewsResponse;", "countyCode", "", "pageNumber", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedNews", "Landroidx/lifecycle/LiveData;", "", "searchNews", "searchQuery", "updateAndInsert", "", "app_debug"})
public final class NewsRepository {
    private final com.example.newsapp.api.ApiService apiService = null;
    private final com.example.newsapp.db.ArticleDatabase db = null;
    
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.api.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.example.newsapp.db.ArticleDatabase db) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBreakingNews(@org.jetbrains.annotations.NotNull()
    java.lang.String countyCode, int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.newsapp.modles.NewsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.newsapp.modles.NewsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateAndInsert(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.modles.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.newsapp.modles.Article>> getSavedNews() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteArticle(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.modles.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}