package com.example.unityapp.data

import com.example.unityapp.ArticlesApi

object ApiImplFactory {

    internal val articlesImpl by lazy {
        create()
    }

    private fun create(): ApiImpl {
        return ArticlesApi()
    }

}

internal interface ApiImpl {
    suspend fun getArticles(): Articles?
}

