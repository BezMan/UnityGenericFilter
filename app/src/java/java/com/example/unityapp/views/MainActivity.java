package com.example.unityapp.views;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.viewModels;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.practicemvvm.databinding.ActivityMainBinding;
import com.example.unityapp.data.Article;
import com.example.unityapp.utils.Filter;
import com.example.unityapp.utils.GenericFilter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainListAdapter.OnItemClickListener {

    private ActivityMainBinding binding;
    private MyViewModel viewModel;

    private MainListAdapter mainListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = viewModels(MyViewModel.class).getValue();

        observeResponse();

        initUI();
    }

    private void initUI() {
        // RECYCLER
        binding.recView.setLayoutManager(new LinearLayoutManager(this));
        binding.recView.setHasFixedSize(true);
        mainListAdapter = new MainListAdapter(this);
        binding.recView.setAdapter(mainListAdapter);

        // CLICKS
        binding.btnFilterData.setOnClickListener(v -> viewModel.fetchData());
    }

    private void displayFilteredList(List<Article> articles) {
        List<Article> list = new ArrayList<>(articles);

        String filterStr = binding.etTextFilter.getText().toString();
        String filterNum = binding.etNumberFilter.getText().toString();

        if (!filterNum.isEmpty() && !filterStr.isEmpty()) {
            List<Filter<Object>> filters = new ArrayList<>();
            filters.add(new GenericFilter.NumberFilter(Integer.parseInt(filterNum)));
            filters.add(new GenericFilter.StringFilter(filterStr));
            list = GenericFilter.filterer(list, filters);
        }

        mainListAdapter.submitList(list);
    }

    private void observeResponse() {
        viewModel.getViewState().observe(this, response -> {
            displayFilteredList(response.getArticles());
        });
    }

    @Override
    public void onItemClick(Article article) {
        Log.d("", "");
    }
}
