package com.smmizan.kotlinbasics

fun main(args: Array<String>){

    val model = Model(1,"Mizan")
    println("id : ${model.id} & name : ${model.name}")



    //initialize constructor
    Data("Sakib","Magura")


}

class Model(val id:Int,val name:String) {

}

class Data(val name :String,val address:String){
    val CustomerName:String
    val CustomerAddress:String


    //initialize
    init {
        CustomerName=name
        CustomerAddress=address

        val customer = (name + " " + address).toUpperCase()
        println("Cumtomer Bio : $customer")
    }
}