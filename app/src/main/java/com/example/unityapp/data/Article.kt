package com.example.unityapp.data

data class Articles(
    val articles: List<Article>
)

data class Article(
    val description: String = "",
    val image_url: String = "",
    val placeholderColor: PlaceholderColor = PlaceholderColor(),
    val rating: Int = -1,
    val title: String = ""
)

data class PlaceholderColor(
    val blue: Int = -1,
    val green: Int = -1,
    val red: Int = -1
)