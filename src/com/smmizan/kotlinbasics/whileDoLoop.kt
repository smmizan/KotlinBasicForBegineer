package com.smmizan.kotlinbasics

fun main (args:Array<String>)
{
//    var count =0
//
//    while(count<=10)
//    {
//        println("Count : $count")
//        count++
//    }



    var numberOne : String
    var numberTwo : String
    var cont : String


    do {
        println("Enter your first number of values")
            numberOne = readLine()!!
        println("Enter your second number of values")
            numberTwo = readLine()!!

        println("$numberOne+$numberTwo = ${numberOne.toInt()+numberTwo.toInt()}")

        println("Are you want to continue your loop Y/N?")
            cont = readLine()!!

    }while (cont == "Y" || cont == "y")
}