package com.example.newsapp.view_models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0002J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/newsapp/view_models/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "newsRepository", "Lcom/example/newsapp/repository/NewsRepository;", "(Lcom/example/newsapp/repository/NewsRepository;)V", "searchNews", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/newsapp/utlis/Resource;", "Lcom/example/newsapp/modles/NewsResponse;", "getSearchNews", "()Landroidx/lifecycle/MutableLiveData;", "searchNewsPage", "", "getSearchNewsPage", "()I", "setSearchNewsPage", "(I)V", "searchNewsResponse", "handleSearchNewsResponse", "response", "Lretrofit2/Response;", "safeSearchNewsCall", "", "searchQuery", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.newsapp.repository.NewsRepository newsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.newsapp.utlis.Resource<com.example.newsapp.modles.NewsResponse>> searchNews = null;
    private int searchNewsPage = 1;
    private com.example.newsapp.modles.NewsResponse searchNewsResponse;
    
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.example.newsapp.repository.NewsRepository newsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.newsapp.utlis.Resource<com.example.newsapp.modles.NewsResponse>> getSearchNews() {
        return null;
    }
    
    public final int getSearchNewsPage() {
        return 0;
    }
    
    public final void setSearchNewsPage(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job searchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery) {
        return null;
    }
    
    private final com.example.newsapp.utlis.Resource<com.example.newsapp.modles.NewsResponse> handleSearchNewsResponse(retrofit2.Response<com.example.newsapp.modles.NewsResponse> response) {
        return null;
    }
    
    private final java.lang.Object safeSearchNewsCall(java.lang.String searchQuery, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}