package com.example.unityapp.utils

import com.example.unityapp.data.Article
import org.junit.Assert.assertEquals
import org.junit.Test

internal class FilterTrialsTest {

    @Test
    fun testFilterer() {
        val filters = listOf(FilterTrials.StringFilter("a"), FilterTrials.NumberFilter(1))
        val list = listOf(
            Article(title = "a", rating = 1),
            Article(title = "abc", rating = 1),
            Article(title = "bca", rating = 1),
            Article(title = "bca", rating = 1),
            Article(title = "bcd", rating = 1),
            Article(title = "a", rating = 2),
            Article(title = "b", rating = 2),
        )

        val filteredList = FilterTrials.filterer(list, filters)
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