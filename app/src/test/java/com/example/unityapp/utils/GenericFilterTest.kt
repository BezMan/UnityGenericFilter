package com.example.unityapp.utils

import com.example.unityapp.data.Article
import org.junit.Assert.assertEquals
import org.junit.Test

internal class GenericFilterTest {

    @Test
    fun testFilterer() {
        val filters = listOf(GenericFilter.StringFilter("a"), GenericFilter.NumberFilter(1))
        val list = listOf(
            Article(title = "a", rating = 1),
            Article(title = "abc", rating = 1),
            Article(title = "bca", rating = 1),
            Article(title = "bca", rating = 1),
            Article(title = "bcd", rating = 1),
            Article(title = "a", rating = 2),
            Article(title = "b", rating = 2),
        )

        val filteredList = GenericFilter.filterer(list, filters)
        println(filteredList)
        val articleList = listOf(
            Article(title = "a", rating = 1),
            Article(title = "abc", rating = 1),
            Article(title = "bca", rating = 1),
            Article(title = "bca", rating = 1)
        )
        assertEquals(articleList, filteredList)

    }
}