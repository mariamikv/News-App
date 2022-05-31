package com.example.newsapp.api.di

import com.example.newsapp.utlis.Constants.BASE_URL
import com.example.newsapp.utlis.Constants.CONNECT_TIMEOUT
import com.example.newsapp.utlis.Constants.READ_TIMEOUT
import com.example.newsapp.utlis.Constants.WRITE_TIMEOUT
import com.google.gson.GsonBuilder
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidApplication
import org.koin.core.scope.Scope
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val retrofitModule = module {

    single {
        Cache(androidApplication().cacheDir, 10L*1024*1024)
    }
    single {
        GsonBuilder().create()
    }
    single {
        retrofitHttpClient()
    }
    single {
        retrofitBuilder()
    }
    single {
        Interceptor { chain ->
            chain.proceed(chain.request().newBuilder().apply {
                header("Accept", "*/*")
            }.build())
        }
    }
}

private fun Scope.retrofitBuilder(): Retrofit {
    return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(get()))
        .client(get())
        .build()
}

private fun Scope.retrofitHttpClient(): OkHttpClient {
    return OkHttpClient.Builder().apply {
        cache(get())
        connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
        writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
        readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
        retryOnConnectionFailure(true)
        addInterceptor(HttpLoggingInterceptor().apply {
            level = if(BuildConfig.DEBUG){
                HttpLoggingInterceptor.Level.HEADERS
            }else{
                HttpLoggingInterceptor.Level.NONE
            }
        })
    }.build()
}