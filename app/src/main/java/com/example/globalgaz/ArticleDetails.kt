package com.example.globalgaz

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.globalgaz.R.layout.activity_article_details

class ArticleDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_details)

        // Get data from intent using safe calls and default values
        val title = intent.getStringExtra("title") ?: ""
        val imageResId = intent.getIntExtra("image", 0)
        val details = intent.getStringExtra("details") ?: ""

        // Find views by ID and set data
        val titleTextView: TextView = findViewById(R.id.title6)
        val imageView: ImageView = findViewById(R.id.image6)
        val detailsTextView: TextView = findViewById(R.id.details4)

        titleTextView.text = title
        imageView.setImageResource(imageResId)
        detailsTextView.text = details
    }
}
