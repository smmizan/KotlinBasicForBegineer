package com.smmizan.kotlinbasics

fun main(args:Array<String>){


    /*use break*/

    for (i in 1..10) {
        if(i==6)
            break
            println("i = $i")
    }

    println("finish my breaking loop")


    var number1:String
    var number2:String
    var isContinue:String

    while(true){
        println("Enter your first number")
        number1 = readLine()!!
        println("Enter your Second Number")
        number2 = readLine()!!
        println("$number1 + $number2 = ${number1.toInt()+number2.toInt()}")
        println("You want to continue loop press y/n")
        isContinue = readLine()!!
        if (isContinue == "n" || isContinue == "N")
            break
    }







}