package com.smmizan.kotlinbasics

fun main(args:Array<String>){

    val bioData = BioData()
    bioData.printBio()

}


class BioData{

    val name:String = "SM Mizan"
    val address:String = "Dhaka,Bangladesh"
    val id:Int = 1234

    fun printBio(){
        println("Name : $name , address : $address , id : $id")
    }

}