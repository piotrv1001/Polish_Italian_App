package com.example.polishspanishapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.polishspanishapp.Adapter.WordsAdapter
import com.example.polishspanishapp.Data.Data
import com.example.polishspanishapp.R
import kotlinx.android.synthetic.main.activity_section.*
import kotlinx.android.synthetic.main.rv_item_2.*

class SectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_section)

        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)

        val list = Data.getSections()
        val position = intent.getIntExtra("Position", 0)
        val section = list[position]
        val section_name = section.getTitle()

        setSupportActionBar(toolbar)
        val actionbar = supportActionBar
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.title = section_name
        toolbar.setNavigationOnClickListener{
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }

        val list_of_words = section.getWords()
        rv_words.layoutManager = LinearLayoutManager(this)
        rv_words.adapter = WordsAdapter(this, list_of_words)
    }
}