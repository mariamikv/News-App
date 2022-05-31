package com.example.newsapp.view_models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\t\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001a0\u0019J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0002J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/example/newsapp/view_models/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "newsRepository", "Lcom/example/newsapp/repository/NewsRepository;", "(Lcom/example/newsapp/repository/NewsRepository;)V", "breakingNews", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/newsapp/utlis/Resource;", "Lcom/example/newsapp/modles/NewsResponse;", "getBreakingNews", "()Landroidx/lifecycle/MutableLiveData;", "breakingNewsPage", "", "getBreakingNewsPage", "()I", "setBreakingNewsPage", "(I)V", "breakingNewsResponse", "deleteArticle", "Lkotlinx/coroutines/Job;", "article", "Lcom/example/newsapp/modles/Article;", "countryCode", "", "getSavedNews", "Landroidx/lifecycle/LiveData;", "", "handleBreakingNewsResponse", "response", "Lretrofit2/Response;", "safeBreakingNewsCall", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savedArticle", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.newsapp.repository.NewsRepository newsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.newsapp.utlis.Resource<com.example.newsapp.modles.NewsResponse>> breakingNews = null;
    private int breakingNewsPage = 1;
    private com.example.newsapp.modles.NewsResponse breakingNewsResponse;
    
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.repository.NewsRepository newsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.newsapp.utlis.Resource<com.example.newsapp.modles.NewsResponse>> getBreakingNews() {
        return null;
    }
    
    public final int getBreakingNewsPage() {
        return 0;
    }
    
    public final void setBreakingNewsPage(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getBreakingNews(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job savedArticle(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.modles.Article article) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.newsapp.modles.Article>> getSavedNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteArticle(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.modles.Article article) {
        return null;
    }
    
    private final com.example.newsapp.utlis.Resource<com.example.newsapp.modles.NewsResponse> handleBreakingNewsResponse(retrofit2.Response<com.example.newsapp.modles.NewsResponse> response) {
        return null;
    }
    
    private final java.lang.Object safeBreakingNewsCall(java.lang.String countryCode, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}