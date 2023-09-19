package com.example.unityapp.utils

import com.example.unityapp.data.Article

class GenericFilter {

    class StringFilter(private val filterStr: String) : Filter {
        override fun filterThisList(list: List<Article>): List<Article> {
            return list.filter { it.title.contains(filterStr) }
        }
    }

    class NumberFilter(private val filterNum: Number) : Filter {
        override fun filterThisList(list: List<Article>): List<Article> {
            return list.filter { it.rating == filterNum }
        }
    }

    companion object {

        fun filterer(list: List<Article>, filters: List<Filter>): List<Article> {
            var res = list

            filters.forEach {
                res = it.filterThisList(res)
            }
            return res
        }


    }

}


interface Filter {
    fun filterThisList(list: List<Article>): List<Article>
}

