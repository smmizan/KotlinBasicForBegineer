package com.smmizan.kotlinbasics

fun main(args:Array<String>){

    val student = Student("Mizan",206)
    println("Name : ${student.Name} , ID : ${student.ID}")

    //use toString Function in Data Class

    println(student.toString())


    // data class Copy Function Example

    val student2 = student.copy("Shakib")
    println("Student Name : ${student.Name} , Student ID : ${student.ID}")
    println("Student Name : ${student2.Name} ,Student ID : ${student2.ID}")

}

data class Student(val Name:String,val ID:Int){}

