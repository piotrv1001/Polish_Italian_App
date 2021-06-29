package com.example.polishspanishapp.Model

class Section(private var title: String, private var title_spanish: String, private var image: Int, private var words: ArrayList<Word>) {
    fun getTitle(): String{
        return this.title
    }
    fun getTitleSpanish(): String{
        return this.title_spanish
    }
    fun getImage(): Int{
        return this.image
    }
    fun getWords(): ArrayList<Word>{
        return this.words
    }
}