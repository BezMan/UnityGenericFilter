package com.example.unityapp.data

import com.example.unityapp.utils.Consts
import com.google.gson.Gson

object ApiImplFactory {

    internal val articlesImpl by lazy {
        create()
    }

    private fun create(): ApiImpl {
        return FakeArticlesApi()
//        return ArticlesApi()
    }

}

internal interface ApiImpl {
    suspend fun getArticles(): Articles?
}


private class ArticlesApi : ApiImpl {

    override suspend fun getArticles(): Articles {
        return Articles(listOf())
    }
}

private class FakeArticlesApi : ApiImpl {

    override suspend fun getArticles(): Articles? {
        // Get the JSON data
        val jsonString = Consts.jsonRaw

        val articles = Gson().fromJson(jsonString, Articles::class.java)

        return articles
    }


}

