package com.smmizan.kotlinbasics

fun main (args : Array<String>){
    myDemo()

    var result = secondFuntion(10.5,10.5)
    println("your input value : 10.5+10.5 = $result")

    functionTwo()
    functionTwo(20)
    functionTwo(30,'A')
    functionTwo(alphabet = 'B')
}


fun myDemo(){
    println("Hello from first functions!")
}


fun functionTwo(number:Int = 10,alphabet:Char = 'y'){

    println("number = $number & character = $alphabet")

}


fun secondFuntion(one:Double,two:Double):Int{

    var sum = one+two;
    return sum.toInt()

}