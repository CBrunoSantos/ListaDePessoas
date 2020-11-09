package com.example.recyclerviewuser.repository

import android.util.Log
import com.example.recyclerviewuser.model.RandomUser
import com.example.recyclerviewuser.service.RandomUserService
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory


object RandomUserRepository {

    private val randomUserService:RandomUserService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://randomuser.me")
            .addConverterFactory(JacksonConverterFactory.create())
            .build()

        randomUserService = retrofit.create(RandomUserService::class.java)

    }

    fun getRandomUsers(quantity:Int = 1):RandomUser?{
        var randomUser:RandomUser? = null

        if (quantity>=1){
            val call = randomUserService.getRandomUser(quantity)
            val response = call.execute()
            randomUser = response.body()

        }else{
            Log.e(RandomUserRepository::class.qualifiedName, "[ERROR] The quantity parameter must be equal or greater than 1")
        }

        return randomUser
    }

}