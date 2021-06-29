package com.example.polishspanishapp.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.polishspanishapp.Adapter.WordsAdapter
import com.example.polishspanishapp.Data.Data
import com.example.polishspanishapp.R
import kotlinx.android.synthetic.main.activity_section.*

class SectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_section)

        val list = Data.getSections()
        val position = intent.getIntExtra("Position", 0)
        val section = list[position]
        val list_of_words = section.getWords()
        rv_words.layoutManager = LinearLayoutManager(this)
        rv_words.adapter = WordsAdapter(this, list_of_words)
    }
}