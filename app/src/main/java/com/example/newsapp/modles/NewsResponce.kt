package com.example.newsapp.modles


import com.google.gson.annotations.SerializedName

data class NewsResponce(
    @SerializedName("articles")
    val articles: List<Article>?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("totalResults")
    val totalResults: Int?
)