package com.example.polishspanishapp.Activities

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.GridLayoutManager
import com.example.polishspanishapp.Adapter.CardViewAdapter
import com.example.polishspanishapp.Data.Data
import com.example.polishspanishapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sectionList = Data.getSections()
        rv_options.layoutManager = GridLayoutManager(this, 2)
        rv_options.adapter = CardViewAdapter(this, sectionList)

    }
}