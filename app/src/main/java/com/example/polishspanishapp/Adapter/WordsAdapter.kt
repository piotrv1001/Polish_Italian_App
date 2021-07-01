package com.example.polishspanishapp.Adapter

import android.content.Context
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.polishspanishapp.Model.Word
import com.example.polishspanishapp.R
import kotlinx.android.synthetic.main.rv_item_2.view.*

class WordsAdapter(val context: Context, val items: ArrayList<Word>): RecyclerView.Adapter<WordsAdapter.ViewHolder>(){

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val polish_word = view.tv_polish_word
        val spanish_word = view.tv_spanish_word
        val btn_expand = view.btn_expand
        val expand_layout = view.expandable_layout
        val card_view = view.card_view
        val word_image = view.iv_word_image
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
        val current_photo = item.getPhoto()

        Glide.with(context)
            .load(current_photo)
            .circleCrop()
            .into(holder.word_image)

        holder.btn_expand.setOnClickListener {
            if(holder.expand_layout.visibility == View.GONE){
                TransitionManager.beginDelayedTransition(holder.card_view, AutoTransition())
                holder.expand_layout.visibility = View.VISIBLE
            }else{

                holder.expand_layout.visibility = View.GONE
            }
        }
    }
}