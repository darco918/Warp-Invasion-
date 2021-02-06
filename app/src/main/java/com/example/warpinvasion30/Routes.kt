package com.example.warpinvasion30

import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.POST

interface Routes {
    @POST("getUser")
    fun getUser(user: User): Call<User>
}