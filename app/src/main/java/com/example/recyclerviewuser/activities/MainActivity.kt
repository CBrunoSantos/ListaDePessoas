package com.example.recyclerviewuser.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewuser.R
import com.example.recyclerviewuser.adapter.RandomUserAdapter
import com.example.recyclerviewuser.adapter.UserAdapter
import com.example.recyclerviewuser.repository.RandomUserRepository
import com.example.recyclerviewuser.repository.UserRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var userList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*val users = UserRepository.findAll()
        val userAdapter = UserAdapter(users)*/

        val randomUserAdapter = RandomUserAdapter(null)
        val viewLayout = LinearLayoutManager(this)

        userList = findViewById<RecyclerView>(R.id.main_recycleview_user_list).apply {
            adapter = randomUserAdapter
            layoutManager = viewLayout
        }

    }

    override fun onStart() {
        super.onStart()
        GlobalScope.launch {

            val randomUser = RandomUserRepository.getRandomUsers(20)

            var adapter = userList.adapter  as RandomUserAdapter

            if(adapter.randomUser == null){
                adapter.randomUser = randomUser
            } else{
                adapter?.randomUser?.results?.addAll(randomUser?.results?.toMutableList()!!)
            }
            val handler = Handler(Looper.getMainLooper())
            handler.post(){
                adapter.notifyDataSetChanged()
            }

            /*Log.i("App","[RESULT] Total: ${randomUser?.results?.size}")
            randomUser?.results?.forEach{
                Log.i("App", "$it")
            }*/
        }
    }


}