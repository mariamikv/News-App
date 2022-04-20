package com.example.newsapp.view_models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.modles.NewsResponce
import com.example.newsapp.repository.NewsRepository
import com.example.newsapp.utlis.Resource
import kotlinx.coroutines.launch
import retrofit2.Response

class NewsViewModel( val newsRepository: NewsRepository): ViewModel(){

    val breakingNews: MutableLiveData<Resource<NewsResponce>> = MutableLiveData()
    val breakingNewsPage = 1

    init {
        getBreakingNews("us")
    }

    fun getBreakingNews(countryCode: String) = viewModelScope.launch {
        breakingNews.postValue(Resource.Loading())
        val response = newsRepository.getBreakingNews(countryCode, breakingNewsPage)

        breakingNews.postValue(handleBreakingNewsResponse(response))
    }

    private fun handleBreakingNewsResponse(response: Response<NewsResponce>): Resource<NewsResponce>{
        if(response.isSuccessful){
            response.body()?.let {
                return Resource.Success(it)
            }
        }
        return Resource.Error(response.message())
    }
}