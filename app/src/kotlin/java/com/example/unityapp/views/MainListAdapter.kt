package com.example.unityapp.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.practicemvvm.R
import com.example.unityapp.data.Article

class MainListAdapter internal constructor(context: OnItemClickListener) : ListAdapter<Article, MainListAdapter.ArticleHolder>(
    DIFF_CALLBACK
) {
    private var listener: OnItemClickListener = context

    internal fun getItemAtPosition(position: Int): Article {
        return getItem(position)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ArticleHolder {
        val itemView = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.main_activity_list_item, viewGroup, false)
        return ArticleHolder(itemView)
    }



    override fun onBindViewHolder(holder: ArticleHolder, position: Int) {
        val currentNote = getItemAtPosition(position)

        holder.apply {
            tvName.text = currentNote.title
            tvRanking.text = currentNote.rating.toString()

        }

    }


    interface OnItemClickListener {
        fun onItemClick(note: Article)
    }

    inner class ArticleHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal val tvName: TextView = itemView.findViewById(R.id.tvDesc)
        internal val tvRanking: TextView = itemView.findViewById(R.id.tvRanking)
//        internal val tvDaystate: TextView = itemView.findViewById(R.id.locDaystate)
//        internal val tvTime: TextView = itemView.findViewById(R.id.locTime)
    }

    companion object {

        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Article>() {
            override fun areItemsTheSame(oldNote: Article, newNote: Article): Boolean {
                return oldNote.title == newNote.title
            }

            override fun areContentsTheSame(oldNote: Article, newNote: Article): Boolean {
//                return oldNote.description == newNote.description
                return true

            }
        }
    }
}
