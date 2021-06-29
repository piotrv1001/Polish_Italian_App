package com.example.polishspanishapp.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.polishspanishapp.Activities.SectionActivity
import com.example.polishspanishapp.Model.Section
import com.example.polishspanishapp.R
import kotlinx.android.synthetic.main.rv_item.view.*

class CardViewAdapter(val context: Context, val items: ArrayList<Section>): RecyclerView.Adapter<CardViewAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val option = view.tv_option
        val option_spanish = view.tv_option_spanish
        val image = view.iv_image
        val card = view.card
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.rv_item, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val section = items[position]
        holder.option.text = section.getTitle()
        holder.option_spanish.text = section.getTitleSpanish()
        holder.image.setImageResource(section.getImage())
        holder.card.setOnClickListener {
            val intent = Intent(context, SectionActivity::class.java)
            intent.putExtra("Position", position)
            startActivity(context, intent, null)
        }
    }
}