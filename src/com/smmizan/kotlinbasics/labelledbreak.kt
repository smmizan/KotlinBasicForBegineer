package com.smmizan.kotlinbasics

fun main(miz:Array<String>)
{




    for (i in 1..10){
        for(j in 1..10)
        {
            if (j == 5)
                break
            println("i = $i & j = $j")
        }
    }



    // label is an identifired,here test is a label

    test@for (m in 1..10){
        for(n in 1..10)
        {
            if (n == 5)
                break@test
            println("i = $m & j = $n")
        }
    }
}