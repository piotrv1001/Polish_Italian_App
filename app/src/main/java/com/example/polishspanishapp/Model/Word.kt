package com.example.polishspanishapp.Model

class Word(private var polish_word: String, private var spanish_word: String, private var photo: Int) {
    fun getPolishWord(): String{
        return this.polish_word
    }
    fun getSpanishWord(): String{
        return this.spanish_word
    }
    fun getPhoto(): Int{
        return this.photo
    }
}