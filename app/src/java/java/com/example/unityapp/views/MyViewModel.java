package com.example.unityapp.views;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewModelScope;

import com.example.unityapp.data.ApiImplFactory;
import com.example.unityapp.data.Articles;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.launch;

public class MyViewModel extends ViewModel {

    private CoroutineDispatcher dispatcher = Dispatchers.IO;

    private MutableLiveData<Articles> _viewState = new MutableLiveData<>();
    public LiveData<Articles> viewState = _viewState;

    public void fetchData() {
        viewModelScope.launch(dispatcher, () -> {
            Articles articles = ApiImplFactory.articlesImpl.getArticles();
            _viewState.postValue(articles);
        });
    }

}

