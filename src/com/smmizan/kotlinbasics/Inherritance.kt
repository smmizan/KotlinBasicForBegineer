package com.smmizan.kotlinbasics

fun main(args: Array<String>){

    var megaCity = MegaCity("Dhaka")
    megaCity.funMegacity()
    megaCity.population()
    megaCity.selary()

}

open class City constructor(var name:String){
    fun population(){
        println("$name - population : 8.5 million")
    }

    fun selary(){
        println("$name - area : 306.38 KM")
    }
}


class MegaCity(name:String):City(name)
{
    fun funMegacity(){
        println("Dhaka is the biggest mega city!")
    }
}