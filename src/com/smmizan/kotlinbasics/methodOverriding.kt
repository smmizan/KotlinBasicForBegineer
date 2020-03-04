package com.smmizan.kotlinbasics

fun main(args:Array<String>){

    Second().showMessages()

}

open class First{
    open fun showMessages(){
        println("hello from first class !")
    }

}


class Second:First(){

    override fun showMessages() {
        super.showMessages()
        println("hello from second class of method override")
    }

}