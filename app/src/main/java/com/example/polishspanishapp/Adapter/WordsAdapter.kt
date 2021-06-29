package com.example.polishspanishapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.polishspanishapp.Model.Word
import com.example.polishspanishapp.R
import kotlinx.android.synthetic.main.rv_item_2.view.*

class WordsAdapter(val context: Context, val items: ArrayList<Word>): RecyclerView.Adapter<WordsAdapter.ViewHolder>(){

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val polish_word = view.tv_polish_word
        val spanish_word = view.tv_spanish_word
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.rv_item_2, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.polish_word.text = item.getPolishWord()
        holder.spanish_word.text = item.getSpanishWord()
    }
}