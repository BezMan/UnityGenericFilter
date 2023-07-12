package com.example.unityapp.views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practicemvvm.R;
import com.example.unityapp.data.Article;

public class MainListAdapter extends ListAdapter<Article, MainListAdapter.ArticleHolder> {

    private OnItemClickListener listener;

    public MainListAdapter(OnItemClickListener context) {
        super(DIFF_CALLBACK);
        this.listener = context;
    }

    public Article getItemAtPosition(int position) {
        return getItem(position);
    }

    @NonNull
    @Override
    public ArticleHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.main_activity_list_item, viewGroup, false);
        return new ArticleHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleHolder holder, int position) {
        Article currentArticle = getItemAtPosition(position);

        holder.tvName.setText(currentArticle.getTitle());
        holder.tvRanking.setText(String.valueOf(currentArticle.getRating()));

        holder.itemView.setOnClickListener(v -> listener.onItemClick(currentArticle));
    }

    public interface OnItemClickListener {
        void onItemClick(Article article);
    }

    static class ArticleHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRanking;

        ArticleHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvDesc);
            tvRanking = itemView.findViewById(R.id.tvRanking);
        }
    }

    private static final DiffUtil.ItemCallback<Article> DIFF_CALLBACK = new DiffUtil.ItemCallback<Article>() {
        @Override
        public boolean areItemsTheSame(@NonNull Article oldItem, @NonNull Article newItem) {
            return oldItem.getTitle().equals(newItem.getTitle());
        }

        @Override
        public boolean areContentsTheSame(@NonNull Article oldItem, @NonNull Article newItem) {
            return true;
        }

    };
}