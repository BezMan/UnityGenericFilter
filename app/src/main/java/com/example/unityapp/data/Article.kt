package com.example.unityapp.data

data class Articles(
    val articles: List<Article>
)

data class Article(
    val description: String,
    val image_url: String,
    val placeholderColor: PlaceholderColor,
    val rating: Int,
    val title: String
)

data class PlaceholderColor(
    val blue: Int,
    val green: Int,
    val red: Int
)