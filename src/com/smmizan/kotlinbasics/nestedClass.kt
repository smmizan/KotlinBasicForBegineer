package com.smmizan.kotlinbasics

fun main(args:Array<String>){


    Demo().sumValues()

}

class Demo{


    fun sumValues(){
        val sum = Nested().a + Nested().b
        println("sum of you values : $sum")
    }

    class Nested{
        val a=10
        val b=20

    }

}