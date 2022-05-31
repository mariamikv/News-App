package com.example.newsapp.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.newsapp.R
import com.example.newsapp.modles.Article
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress

public class BreakingNewsFragmentDirections private constructor() {
  private data class ActionBreakingNewsFragmentToArticleFragment(
    public val articleData: Article? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_breakingNewsFragment_to_articleFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Article::class.java)) {
          result.putParcelable("articleData", this.articleData as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Article::class.java)) {
          result.putSerializable("articleData", this.articleData as Serializable?)
        }
        return result
      }
  }

  public companion object {
    public fun actionBreakingNewsFragmentToArticleFragment(articleData: Article? = null):
        NavDirections = ActionBreakingNewsFragmentToArticleFragment(articleData)
  }
}
