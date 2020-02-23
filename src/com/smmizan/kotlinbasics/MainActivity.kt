package com.smmizan.kotlinbasics

fun main(args: Array<String>){

    /*array*/
//    val y = arrayOf(10,20,30,40,50)
//
//    println("taken number is ${y[2]}")
//    println("array size ${y.size-1}")


   /* if else statement*/

//    val a :Int = 20
//    val b:Int = 20
//
//    if (a < b)
//        println("a is less then b")
//    else if(a==b)
//        println("a is equal b")
//    else if(a>b)
//        println("b is less then a")


   /* when operation*/


//    val a :Int = 12
//    val b :Int = 6
//
//    println("please input your needed operation")
//    val operation = readLine()

//    when(operation)
//    {
//        "+" ->
//        {
//            val result = a+b
//            println("$a + $b + = $result")
//        }
//
//        "-" ->
//        {
//            val result = a-b
//            println("$a - $b + = $result")
//        }
//
//
//        "*" ->
//        {
//            val result = a*b
//            println("$a * $b + = $result")
//        }
//
//        "/" ->
//        {
//            val result = a/b
//            println("$a / $b + = $result")
//        }
//
//        else -> println("$operation invalid operation")
//
//    }


    /*kotlin super operation condition*/

//    val results = when(operation){
//        "+"-> "$a + $b = ${a+b}"
//        "-"-> "$a - $b = ${a-b}"
//        "*"-> "$a * $b = ${a*b}"
//        "/"-> "$a / $b = ${a/b}"
//        else -> println("$operation is invalid")
//
//    }
//
//    println(results)


    /*for loop in kotlin*/

    var list = arrayOf("Dhaka","Jamalpur","Sylhet","Rangpur","Comilla","Bogura")
    for (a in list)
    {
        println(a)
    }


    for(b in list.indices)
    {
        println("city[$b] : "+ list[b])
    }


    var c = "Mizan"

    for(d in c)
    {
        println(d)
    }

    for (x in 1..5)
    {
        println(x)
    }


}