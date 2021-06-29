package com.example.polishspanishapp.Data

import com.example.polishspanishapp.Model.Section
import com.example.polishspanishapp.Model.Word
import com.example.polishspanishapp.R

class Data {
    companion object{
        fun getSections(): ArrayList<Section> {
            val sections = ArrayList<Section>()
            val family_words = ArrayList<Word>()
            family_words.add(Word("Tata","Padre"))
            family_words.add(Word("Mama","Mamá"))
            family_words.add(Word("Brat","Hermano"))
            family_words.add(Word("Siostra","Hermana"))
            val family = Section("Rodzina", "Familia", R.drawable.ic_launcher_background, family_words)
            sections.add(family)
            val numbers = Section("Liczby", "Números", R.drawable.ic_launcher_background, family_words)
            sections.add(numbers)
            val food = Section("Jedzenie", "Comida", R.drawable.ic_launcher_background, family_words)
            sections.add(food)
            val sport = Section("Sport", "Deporte", R.drawable.ic_launcher_background, family_words)
            sections.add(sport)
            val airport =
                Section("Na lotnisku", "En el aeropuerto", R.drawable.ic_launcher_background, family_words)
            sections.add(airport)
            val restaurant =
                Section("W restauracji", "En el restaurante", R.drawable.ic_launcher_background, family_words)
            sections.add(restaurant)
            val city = Section("W mieście", "En la ciudad", R.drawable.ic_launcher_background, family_words)
            sections.add(city)
            val shop = Section("Na zakupach", "En compras", R.drawable.ic_launcher_background, family_words)
            sections.add(shop)

            return sections
        }
    }
}