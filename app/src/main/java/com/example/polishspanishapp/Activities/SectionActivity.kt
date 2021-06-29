package com.example.polishspanishapp.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.polishspanishapp.Data.Data
import com.example.polishspanishapp.R
import kotlinx.android.synthetic.main.activity_section.*

class SectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_section)

        val list = Data.getSections()
        var position = intent.getIntExtra("Position", 0)
        var item = list[position]
        tv_dummy.text = item.getTitle()
    }
}