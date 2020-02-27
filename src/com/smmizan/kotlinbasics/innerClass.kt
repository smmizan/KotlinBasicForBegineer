package com.smmizan.kotlinbasics

fun main(args:Array<String>){

    Outer().Inner().sumValues()

}


class Outer{

    var a =30
    var b =20


    inner class Inner{

        fun sumValues(){
            var sum = a+b
            println("sum of values : $sum")
        }

    }

}