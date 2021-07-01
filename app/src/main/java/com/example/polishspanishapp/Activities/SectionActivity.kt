package com.example.polishspanishapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.polishspanishapp.Adapter.ViewPagerAdapter
import com.example.polishspanishapp.Adapter.WordsAdapter
import com.example.polishspanishapp.Data.Data
import com.example.polishspanishapp.Fragments.QuizFragment
import com.example.polishspanishapp.Fragments.WordsFragment
import com.example.polishspanishapp.R
import kotlinx.android.synthetic.main.activity_section.*
import kotlinx.android.synthetic.main.fragment_words.*
import kotlinx.android.synthetic.main.rv_item_2.*

class SectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_section)

        setUpTabs()

    }
    private fun setUpTabs(){
        val position = intent.getIntExtra("Position", 0)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(WordsFragment(this, position),"SŁÓWKA")
        adapter.addFragment(QuizFragment(),"QUIZ")
        view_pager.adapter = adapter
        tabs.setupWithViewPager(view_pager)
    }
}