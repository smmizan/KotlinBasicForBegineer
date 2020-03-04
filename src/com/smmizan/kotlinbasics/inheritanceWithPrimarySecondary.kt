package com.smmizan.kotlinbasics

fun main(args:Array<String>){

    SecondModel("Kotlin")

}

open class FirstModel(name:String){
    init {
        println("from first model $name")
    }
}


class SecondModel:FirstModel{
    constructor(name:String):super(name){
        println("from secondary constructor $name")
    }
}