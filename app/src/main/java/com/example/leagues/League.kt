package com.example.leagues


class League(var name:String = "unknown") {
    var teams = mutableListOf<Team>()
    var matches = mutableListOf<Match>()
    fun addTeam(team1: Team){
        teams.add(team1)
    }
    fun addMatch(match1: Any){
        try{
        matches.add(match1 as Match)
         }
        catch(e:ClassCastException){
            println(e.message)
        }
    }

}