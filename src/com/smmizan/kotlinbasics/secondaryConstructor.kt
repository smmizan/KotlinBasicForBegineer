package com.smmizan.kotlinbasics

fun main(args:Array<String>){

    val employee = Employee(226,"Rakib","Dhaka")
    employee.deptWiseEmployee()

    val employee2 = Employee(200,"Sahin","Dubai")
    employee2.deptWiseEmployee()


}


class Employee constructor(val id:Int,val name:String,var address:String){

    var department:String = "HR"

    constructor(id:Int,name:String, address:String,department:String):this(id,name,address)
    {
        this.department=department
    }

    fun deptWiseEmployee(){
        println("id = $id , name = $name , department = $department")
    }
}