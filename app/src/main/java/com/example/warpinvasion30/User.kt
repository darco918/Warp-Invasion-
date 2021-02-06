package com.example.warpinvasion30

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("user_id")
    val user_id :Int,

    @SerializedName("user_name")
 val user_name :String,

    @SerializedName("user_password")
         val user_password: String,

 @SerializedName("user_currentskin")
 val user_currentskin:Int,

    @SerializedName("user_currentenemyskin")
    val user_currentenemyskin:Int,

    @SerializedName("user_currentmode")
    val user_currentmode:Int
 ){

}