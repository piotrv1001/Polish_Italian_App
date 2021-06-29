package com.example.polishspanishapp.Model

class Section(private var title: String, private var title_spanish: String, private var image: Int) {
    fun getTitle(): String{
        return this.title
    }
    fun getTitleSpanish(): String{
        return this.title_spanish
    }
    fun getImage(): Int{
        return this.image
    }
}