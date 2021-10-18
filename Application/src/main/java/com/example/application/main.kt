package com.example.application

import java.lang.Exception
import java.time.DateTimeException
import java.time.LocalDate

fun bubbleSort(numbers: MutableList<Team>): MutableList<Team> {
    for (pass in 0 until (numbers.size - 1)) {
        // A single pass of bubble sort
        for (currentPosition in 0 until (numbers.size - 1)) {
            // This is a single step
            if (numbers[currentPosition].compareTo(numbers[currentPosition + 1]) == 1) {
                val tmp = numbers[currentPosition]
                numbers[currentPosition] = numbers[currentPosition + 1]
                numbers[currentPosition + 1] = tmp
            }
        }
    }
    return numbers
}
fun main(){
    var player1 = Player("valentin", LocalDate.of(2000,10,24))
    var player3 = Player("jurij", LocalDate.of(2000,10,24))
    var player4 = Player("brane", LocalDate.of(2000,10,24))
    var player2 = Player("ronaldo")
    var player5 = Player("dababy22", LocalDate.of(2000,10,24))
    try {
        player5.validateName();
    }catch(e:ValidNameException){
        println(e.message)
    }
    var team1 = Team("sylas")
    var team2 = Team("barca")
    var team3 = Team("real")
    team1.addPlayer(player4)
    team3.wins++
    team3.wins++
    team1.wins++
    team2.wins++
    team2.wins++
    team2.wins++
    team2.addPlayer(player1)
    team2.addPlayer(player2)
    team3.addPlayer(player3)
    var myLeague = League("first league")
    myLeague.addTeam(team2)
    myLeague.addTeam(team3)
    myLeague.addTeam(team1)
    try {
        var sorted = bubbleSort(myLeague.teams)

        for (team in sorted) {
            println(team.toString())
        }
    }
    catch(e:StringIndexOutOfBoundsException){
        println(e.message)
    }
    println(player1.name)
    try {
        var date = LocalDate.of(2000, 3, 32)

    var match1 = Match(1,team1,team2,date)
    println(match1.date);
    println(player1.birthdate)
    }
    catch(e:DateTimeException){
        println(e.message)
    }

    myLeague.addMatch(34)

}