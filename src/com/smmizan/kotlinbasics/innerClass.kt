package com.smmizan.kotlinbasics

fun main(args:Array<String>){

    OuterClass().InnerClass().sumOfValues()

}


class OuterClass{

    var a =30
    var b =20


    inner class InnerClass{

        fun sumOfValues(){
            var sum = a+b
            println("sum of values : $sum")
        }

    }

}