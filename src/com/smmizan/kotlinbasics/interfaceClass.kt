package com.smmizan.kotlinbasics

fun main(args: Array<String>){

    val techHunt = TechHunt()
    techHunt.showDepartment()
    techHunt.departmentTotalActiveMember()

}


interface Department{
    var deptName:String
    var deptCode:String
    var deptTotalMember:Int

    fun showDepartment(){
        println("Department Name : $deptName , Department Code : $deptCode")
    }



    fun departmentTotalActiveMember()
    {

    }


}


class TechHunt:Department{
    override var deptName = "Marketing"
    override var deptCode = "M21"
    override var deptTotalMember = 120

    override fun departmentTotalActiveMember() {
        println("Department Code : $deptCode \n Department Member : $deptTotalMember \n Department Name : $deptName")
    }

}