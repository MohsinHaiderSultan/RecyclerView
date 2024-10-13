package com.example.globalgaz


import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class ArticlesAdapter(private val articles: List<Article>) : RecyclerView.Adapter<ArticleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        Log.d("ArticlesAdapter", "onCreateViewHolder: View holder created")
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_article, parent, false)
        return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int = articles.size

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        Log.d("ArticlesAdapter", "onBindViewHolder: Binding item #$position")
        val article = articles[position]
        holder.title.text = article.title
        holder.image.setImageResource(article.imageResId)  // Adjusted property name

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, ArticleDetails::class.java).apply {
                putExtra("title", article.title)
                putExtra("image", article.imageResId)  // Adjusted property name
                putExtra("date", article.date)
                putExtra("details", article.details)
            }
            context.startActivity(intent)
        }
    }
}
