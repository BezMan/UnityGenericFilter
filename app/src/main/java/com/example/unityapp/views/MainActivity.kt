package com.example.unityapp.views

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practicemvvm.databinding.ActivityMainBinding
import com.example.unityapp.data.Article
import com.example.unityapp.utils.Filter
import com.example.unityapp.utils.FilterTrials

class MainActivity : AppCompatActivity(), MainListAdapter.OnItemClickListener {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MyViewModel>()

    private lateinit var mainListAdapter: MainListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        observeResponse()

        initUI()
    }


    private fun initUI() {
        //RECYCLER
        binding.recView.layoutManager = LinearLayoutManager(this)
        binding.recView.setHasFixedSize(true)
        mainListAdapter = MainListAdapter(this)
        binding.recView.adapter = mainListAdapter

        //CLICKS
        binding.btnFilterData.setOnClickListener {
            viewModel.fetchData()
        }
    }

    private fun displayFilteredList(articles: List<Article>) {
        var list = articles

        val filterStr = binding.etTextFilter.text
        val filterNum = binding.etNumberFilter.text

        if (filterNum.isNotBlank() && filterStr.isNotBlank()) {

            val filters = mutableListOf<Filter<Any>>(
                FilterTrials.NumberFilter(filterNum.toString().toInt()),
                FilterTrials.StringFilter(filterStr.toString())
            )
            list = FilterTrials.filterer(list, filters)
        }
        mainListAdapter.submitList(list)
    }

    private fun observeResponse() {
        viewModel.viewState.observe(this) { response ->
            displayFilteredList(response.articles)
        }
    }

    override fun onItemClick(note: Article) {
        Log.d("", "")
    }
}
