package com.example.globalgaz

data class Article(
    val title: String,
    val date: String,
    val imageResId: Int, // Ensure this matches your image resource ID
    val details: String // This should be defined if you want to access it
)

