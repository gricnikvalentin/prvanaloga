package com.example.application
import java.time.LocalDate

class Match(val id:Int, var team1:Team, var team2:Team, var date:LocalDate = LocalDate.now()) {

}