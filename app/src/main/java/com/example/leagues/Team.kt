package com.example.leagues

class Team(val name:String) :Comparable<Team>,Sizeable{
    var wins = 0;
    var players = mutableListOf<Player>()
    var matches = mutableListOf<Match>()
    fun addPlayer(player: Player) {
        players.add(player);
    }
    fun addMatches(match: Match) {
        matches.add(match);
    }
    fun getMatches(): Any? {
        return matches;
    }

    override fun compareTo(other: Team): Int {
        if(other.wins > wins){
            return 1
        }
        return 0
    }
    override fun toString():String {
        var returnVal = ""
        var playerinos =""
        for(player in players){
            playerinos+=player.name + ","
        }
        var realPlayers = playerinos.substring(0,playerinos.length-1)
        returnVal += "teamname: ${name} \n wins: ${wins} \n players: ${realPlayers}"
        return returnVal
    }

    override fun size(): Int {
        return players.size;
    }
}