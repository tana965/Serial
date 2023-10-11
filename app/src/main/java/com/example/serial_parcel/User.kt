package com.example.serial_parcel

import java.io.Serializable

class User(): Serializable {
    private  var name1: String = " "
    private  var name2: String = " "

    constructor(_name1:String,_name2:String):this(){
        name1=_name1
        name2=_name2
    }

    fun setName1(_name1: String){
    name1=_name1
    }
    fun getName1():String{
    return name1
    }

    fun setName2(_name2: String){
    name2=_name2
    }
    fun getName2(): String{
    return name2
    }

}