package com.example.unityapp

import com.example.unityapp.data.ApiImpl
import com.example.unityapp.data.Articles

class ArticlesApi : ApiImpl {

    override suspend fun getArticles(): Articles {
        return Articles(listOf())
    }
}
