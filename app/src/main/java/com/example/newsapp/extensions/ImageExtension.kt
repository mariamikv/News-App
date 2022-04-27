package com.example.newsapp.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.newsapp.R

fun ImageView.setImageUrl(url:String){
    if(url.isNotEmpty()){
        Glide.with(context).load(url)
            .placeholder(R.drawable.placeholder)
            .into(this)
    }else{
        setImageResource(R.drawable.placeholder)
    }
}
