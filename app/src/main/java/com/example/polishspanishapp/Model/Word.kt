package com.example.polishspanishapp.Model

class Word(private var polish_word: String, private var spanish_word: String) {
    fun getPolishWord(): String{
        return this.polish_word
    }
    fun getSpanishWord(): String{
        return this.spanish_word
    }
}