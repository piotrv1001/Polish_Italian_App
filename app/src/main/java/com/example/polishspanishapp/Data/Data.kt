package com.example.polishspanishapp.Data

import com.example.polishspanishapp.Model.Section
import com.example.polishspanishapp.Model.Word
import com.example.polishspanishapp.R

class Data {
    companion object{
        fun getSections(): ArrayList<Section>{
            val sections = ArrayList<Section>()
            val family = Section("Rodzina", "Familia", R.drawable.ic_launcher_background)
            sections.add(family)
            val numbers = Section("Liczby", "Números", R.drawable.ic_launcher_background)
            sections.add(numbers)
            val food = Section("Jedzenie", "Comida", R.drawable.ic_launcher_background)
            sections.add(food)
            val sport = Section("Sport", "Deporte", R.drawable.ic_launcher_background)
            sections.add(sport)

            return sections
        }
    }
}