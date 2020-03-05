package com.smmizan.kotlinbasics

fun main(args:Array<String>){

    var birds = Birds()
    birds.birds()
    birds.fish()
    birds.birdsDetail()
    birds.fishDetail()

}

abstract class Animal{
    abstract var name:String
    abstract var color:String

    abstract fun birds()
    abstract fun fish()


    var birdsName = "Doyel"

    fun birdsDetail(){
        println("birds name is : $birdsName")
    }


    fun fishDetail(){
        println("Hello Birds Lover!")
    }

}



class Birds:Animal(){
    override var name = "Parrot"
    override var color = "Green"

    override fun birds() {
        println("Birds Name : $name")
    }

    override fun fish() {
        println("Birds Color : $color")
    }

}