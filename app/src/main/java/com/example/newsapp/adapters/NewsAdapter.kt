package com.example.newsapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.databinding.ItemArticlePreviewBinding
import com.example.newsapp.extensions.setImageUrl
import com.example.newsapp.modles.Article

class NewsAdapter: RecyclerView.Adapter<NewsAdapter.ArticleViewHolder>() {

    private val differCallback = object : DiffUtil.ItemCallback<Article>(){
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem.url == newItem.url
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem
        }
    }

    val differ  = AsyncListDiffer(this, differCallback)

    private var onItemClickListener: ((Article) -> Unit)? = null

    class ArticleViewHolder(private val binding: ItemArticlePreviewBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(article: Article, onItemClickListener: ((Article) -> Unit)?) {
            with(binding){
                article.urlToImage?.let { ivArticleImage.setImageUrl(it) }
                tvSource.text = article.source?.name
                tvTitle.text = article.title
                tvPublishedAt.text = article.publishedAt

                root.setOnClickListener {
                    onItemClickListener?.let { it(article) }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val dataHolder = ItemArticlePreviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ArticleViewHolder(dataHolder)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) = holder.bind(differ.currentList[position], onItemClickListener)

    override fun getItemCount(): Int = differ.currentList.size

    fun setOnItemClickListener(listener: (Article) -> Unit){
        onItemClickListener = listener
    }
}