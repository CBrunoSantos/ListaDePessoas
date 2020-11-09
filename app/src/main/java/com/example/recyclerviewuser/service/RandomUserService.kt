package com.example.recyclerviewuser.service


import com.example.recyclerviewuser.model.RandomUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomUserService {

    @GET("/api")
    fun getRandomUser(@Query("results")quantity:Int):Call<RandomUser>

}