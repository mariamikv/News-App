package com.example.newsapp.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.example.newsapp.databinding.FragmentArticleBinding
import com.example.newsapp.ui.NewsActivity
import com.example.newsapp.utlis.BaseFragment
import com.example.newsapp.view_models.NewsViewModel
import org.koin.android.ext.android.get

class ArticleFragment : BaseFragment<FragmentArticleBinding>(FragmentArticleBinding::inflate) {

    private val viewModel = get<NewsViewModel>()
    private val args: ArticleFragmentArgs by navArgs()

    override fun startCreating(inflater: LayoutInflater, container: ViewGroup?) {
        init()
    }

    private fun init(){

        val article = args.articleData
        // display article in web view
        binding.webView.apply {
            webViewClient = WebViewClient()
            article?.url?.let { loadUrl(it) }
        }

        binding.fab.setOnClickListener {
            if (article != null) {
                viewModel.savedArticle(article)
            }
            Toast.makeText(requireContext(), "Article saved successfully", Toast.LENGTH_LONG).show()
        }
    }
}