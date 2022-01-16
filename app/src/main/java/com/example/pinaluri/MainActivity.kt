package com.example.pinaluri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var gilaki1:Button
    lateinit var gilaki2:Button
    lateinit var gilaki3:Button
    lateinit var gilaki4:Button
    lateinit var gilaki5:Button
    lateinit var gilaki6:Button
    lateinit var gilaki7:Button
    lateinit var gilaki8:Button
    lateinit var gilaki9:Button
    lateinit var gilaki0:Button
    lateinit var gamosaxuleba:TextView
    lateinit var gayopa1:Button
    lateinit var gamravleba2:Button
    lateinit var mimateba3:Button
    lateinit var gamokleba4:Button
    lateinit var gasuftaveba5:Button
    lateinit var gamotvla6:Button

    var mimatebamimdinareobs=false
    var gamoklebamimdinareobs=false
    var gamravlebamimdinareobs=false
    var gayopamimdinareobs=false
    var number=0
    var number2=0
    var moqmedebamimdinareobs=false

    override fun onClick(view:View){
        when(view){
            gilaki1->{gamosaxuleba.text=gamosaxuleba.text.toString()+1}
            gilaki2->{gamosaxuleba.text=gamosaxuleba.text.toString()+2}
            gilaki3->{gamosaxuleba.text=gamosaxuleba.text.toString()+3}
            gilaki4->{gamosaxuleba.text=gamosaxuleba.text.toString()+4}
            gilaki5->{gamosaxuleba.text=gamosaxuleba.text.toString()+5}
            gilaki6->{gamosaxuleba.text=gamosaxuleba.text.toString()+6}
            gilaki7->{gamosaxuleba.text=gamosaxuleba.text.toString()+7}
            gilaki8->{gamosaxuleba.text=gamosaxuleba.text.toString()+8}
            gilaki9->{gamosaxuleba.text=gamosaxuleba.text.toString()+9}
            gilaki0->{gamosaxuleba.text=gamosaxuleba.text.toString()+0}

            mimateba3->{
                if (moqmedebamimdinareobs==false){
                number=gamosaxuleba.text.toString().toInt()
            mimatebamimdinareobs=true
            gamosaxuleba.text=""
                moqmedebamimdinareobs=true}
            }
            gamotvla6->{
                if (mimatebamimdinareobs==true){
                    number2=gamosaxuleba.text.toString().toInt()
                    gamosaxuleba.text=(number+number2).toString()
                    mimatebamimdinareobs=false
                    moqmedebamimdinareobs=false
                }
                else if (gamoklebamimdinareobs==true){
                    number2=gamosaxuleba.text.toString().toInt()
                    gamosaxuleba.text=(number-number2).toString()
                    gamoklebamimdinareobs=false
                    moqmedebamimdinareobs=false
                }
                else if (gamravlebamimdinareobs==true){
                    number2=gamosaxuleba.text.toString().toInt()
                    gamosaxuleba.text=(number*number2).toString()
                    gamravlebamimdinareobs=false
                    moqmedebamimdinareobs=false
                }
                else if (gayopamimdinareobs==true){
                    number2=gamosaxuleba.text.toString().toInt()
                    gamosaxuleba.text=(number/number2).toString()
                    gayopamimdinareobs=false
                    moqmedebamimdinareobs=false
                }
            }
            gamokleba4->{
                if (moqmedebamimdinareobs==false){
                number=gamosaxuleba.text.toString().toInt()
            gamoklebamimdinareobs=true
            moqmedebamimdinareobs=true
            gamosaxuleba.text=""}
            }
            gamravleba2->{
                if (moqmedebamimdinareobs==false){
                number=gamosaxuleba.text.toString().toInt()
            gamravlebamimdinareobs=true
            gamosaxuleba.text=""
                moqmedebamimdinareobs=true}
            }
            gayopa1->{
                if (moqmedebamimdinareobs==false){
                number=gamosaxuleba.text.toString().toInt()
            gayopamimdinareobs=true
            gamosaxuleba.text=""
                    moqmedebamimdinareobs=true}
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gilaki1=findViewById(R.id.button1)
        gilaki2=findViewById(R.id.button2)
        gilaki3=findViewById(R.id.button3)
        gilaki4=findViewById(R.id.button4)
        gilaki5=findViewById(R.id.button5)
        gilaki6=findViewById(R.id.button6)
        gilaki7=findViewById(R.id.button7)
        gilaki8=findViewById(R.id.button8)
        gilaki9=findViewById(R.id.button9)
        gilaki0=findViewById(R.id.button0)
        gayopa1=findViewById(R.id.buttongayopa)
        gamravleba2=findViewById(R.id.buttongamravleba)
        mimateba3=findViewById(R.id.buttonpliusi)
        gamokleba4=findViewById(R.id.buttonminusi)
        gasuftaveba5=findViewById(R.id.buttonclear)
        gamotvla6=findViewById(R.id.buttoncalculate)
        gamosaxuleba=findViewById(R.id.numbers)



    }
}