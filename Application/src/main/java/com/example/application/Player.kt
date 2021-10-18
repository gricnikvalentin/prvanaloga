package com.example.application

import java.time.LocalDate

class Player(var name: String = "unknown", val birthdate:LocalDate = LocalDate.MIN) {
    fun validateName(){
        if(name.matches(Regex(".*\\d+.*"))) {
            throw ValidNameException("Your name : $name : contains numerals.")
        }
    }
}