package com.example.unityapp

import com.example.unityapp.data.ApiImpl
import com.example.unityapp.data.Articles
import com.example.unityapp.utils.Consts
import com.google.gson.Gson

class ArticlesApi : ApiImpl {

    override suspend fun getArticles(): Articles? {
        // Get the JSON data
        val jsonString = Consts.jsonRaw

        val articles = Gson().fromJson(jsonString, Articles::class.java)

        return articles
    }


}
