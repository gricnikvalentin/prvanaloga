package com.example.leagues

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDate
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var players = mutableListOf<Player>();
        setContentView(R.layout.activity_main)
        exit.setOnClickListener{
            exitProcess(0);
        }
        add.setOnClickListener {
            var zaDodat = Player(editTextTextPersonName.text.toString(), editTextTextPersonName3.text.toString(),editTextNumber.text.toString().toInt());
            println(zaDodat.name)
            println(zaDodat.surname)
            println(zaDodat.age)
            players.add(zaDodat)
            editTextNumber.text.clear();
            editTextTextPersonName.text.clear()
            editTextTextPersonName3.text.clear()
        }
        show.setOnClickListener {
            for(player in players){
                println(player.toString())
            }
        }
    }
}