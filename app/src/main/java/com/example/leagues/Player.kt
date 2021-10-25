package com.example.leagues

import java.time.LocalDate

class Player(var name: String = "unknown",var surname:String = "unknown", val age:Int = 0) {


    fun validateName(){
        if(name.matches(Regex(".*\\d+.*"))) {
            throw ValidNameException("Your name : $name : contains numerals.")
        }
    }
    override fun toString(): String {
        return("Player: " + this.name + " " + this.surname + " is aged: " + this.age)
    }
}