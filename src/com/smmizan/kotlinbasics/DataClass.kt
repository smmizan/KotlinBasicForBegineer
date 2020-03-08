package com.smmizan.kotlinbasics

fun main(args:Array<String>){

    val student = Student("Mizan",206)
    println("Name : ${student.Name} , ID : ${student.ID}")

    println(student.toString())

}

data class Student(val Name:String,val ID:Int){}

