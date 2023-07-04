package com.example.unityapp.views

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.unityapp.data.ApiImplFactory
import com.example.unityapp.data.Articles
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyViewModel : ViewModel() {

    private val dispatcher: CoroutineDispatcher = Dispatchers.IO

    private val _viewState = MutableLiveData<Articles>()
    val viewState: LiveData<Articles>
        get() = _viewState


    fun fetchData() {
        viewModelScope.launch(dispatcher) {
            val articles = ApiImplFactory.articlesImpl.getArticles()

            _viewState.postValue(articles)
        }
    }


}