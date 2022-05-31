package com.example.newsapp.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u001a\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/newsapp/ui/fragments/SearchNewsFragment;", "Lcom/example/newsapp/utlis/BaseFragment;", "Lcom/example/newsapp/databinding/FragmentSearchNewsBinding;", "()V", "isLastPage", "", "()Z", "setLastPage", "(Z)V", "isLoading", "setLoading", "isScrolling", "setScrolling", "newsAdapter", "Lcom/example/newsapp/adapters/NewsAdapter;", "pagingScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "viewModel", "Lcom/example/newsapp/view_models/SearchViewModel;", "hideProgressBar", "", "init", "setUpRecyclerView", "showProgressBar", "startCreating", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
public final class SearchNewsFragment extends com.example.newsapp.utlis.BaseFragment<com.example.newsapp.databinding.FragmentSearchNewsBinding> {
    private final com.example.newsapp.view_models.SearchViewModel viewModel = null;
    private com.example.newsapp.adapters.NewsAdapter newsAdapter;
    private boolean isLoading = false;
    private boolean isLastPage = false;
    private boolean isScrolling = false;
    private androidx.recyclerview.widget.RecyclerView.OnScrollListener pagingScrollListener;
    private java.util.HashMap _$_findViewCache;
    
    public SearchNewsFragment() {
        super(null);
    }
    
    @java.lang.Override()
    public void startCreating(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
    }
    
    private final void init() {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    public final boolean isLastPage() {
        return false;
    }
    
    public final void setLastPage(boolean p0) {
    }
    
    public final boolean isScrolling() {
        return false;
    }
    
    public final void setScrolling(boolean p0) {
    }
    
    private final void setUpRecyclerView() {
    }
    
    private final void hideProgressBar() {
    }
    
    private final void showProgressBar() {
    }
}