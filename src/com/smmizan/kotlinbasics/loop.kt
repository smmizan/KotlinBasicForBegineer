package com.smmizan.kotlinbasics

fun main(args : Array<String>)
{

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