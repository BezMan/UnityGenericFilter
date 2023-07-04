package com.example.unityapp.utils

import com.example.unityapp.data.Article

class FilterTrials {

    class StringFilter(private val filterStr: String) : Filter<String> {
        override fun filterThisList(list: List<Article>): List<Article> {
            return list.filter { it.title.contains(filterStr) }
        }
    }

    class NumberFilter(private val filterNum: Number) : Filter<Number> {
        override fun filterThisList(list: List<Article>): List<Article> {
            return list.filter { it.rating == filterNum }
        }
    }

    companion object {

        fun filterer(list: List<Article>, filters: List<Filter<Any>>): List<Article> {
            var res = list

            filters.forEach {
                res = it.filterThisList(res)
            }
            return res
        }


    }

}


interface Filter<out T> {
    fun filterThisList(list: List<Article>): List<Article>
}

