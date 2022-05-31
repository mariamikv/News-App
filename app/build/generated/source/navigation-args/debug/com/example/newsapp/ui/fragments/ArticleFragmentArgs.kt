package com.example.newsapp.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.newsapp.modles.Article
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ArticleFragmentArgs(
  public val articleData: Article? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Article::class.java)) {
      result.putParcelable("articleData", this.articleData as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Article::class.java)) {
      result.putSerializable("articleData", this.articleData as Serializable?)
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Article::class.java)) {
      result.set("articleData", this.articleData as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Article::class.java)) {
      result.set("articleData", this.articleData as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ArticleFragmentArgs {
      bundle.setClassLoader(ArticleFragmentArgs::class.java.classLoader)
      val __articleData : Article?
      if (bundle.containsKey("articleData")) {
        if (Parcelable::class.java.isAssignableFrom(Article::class.java) ||
            Serializable::class.java.isAssignableFrom(Article::class.java)) {
          __articleData = bundle.get("articleData") as Article?
        } else {
          throw UnsupportedOperationException(Article::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __articleData = null
      }
      return ArticleFragmentArgs(__articleData)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ArticleFragmentArgs {
      val __articleData : Article?
      if (savedStateHandle.contains("articleData")) {
        if (Parcelable::class.java.isAssignableFrom(Article::class.java) ||
            Serializable::class.java.isAssignableFrom(Article::class.java)) {
          __articleData = savedStateHandle.get<Article?>("articleData")
        } else {
          throw UnsupportedOperationException(Article::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __articleData = null
      }
      return ArticleFragmentArgs(__articleData)
    }
  }
}
