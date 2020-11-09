package com.example.recyclerviewuser.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewuser.R
import com.example.recyclerviewuser.model.GenderType
import com.example.recyclerviewuser.model.User
import kotlinx.android.synthetic.main.item_user_layout.view.*

class UserAdapter (private val userList:List<User>):RecyclerView.Adapter<UserAdapter.UserViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_layout, parent,false)
        return  UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]

        holder.userName.text = user.name
        holder.userPhone.text = user.phone
        holder.userEmail.text = user.email

        when(user.gender){
            GenderType.MALE ->{
                holder.userAvatar.setImageResource(R.drawable.male)
            }
            GenderType.FAMALE ->{
                holder.userAvatar.setImageResource(R.drawable.female)
            }
        }


    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class UserViewHolder(view: View):RecyclerView.ViewHolder(view){
        val userAvatar:ImageView = view.findViewById(R.id.item_imageview_user_avatar)
        val userName:TextView = view.findViewById(R.id.item_textview_user_name)
        val userPhone:TextView = view.findViewById(R.id.item_textview_user_phone)
        val userEmail:TextView = view.findViewById(R.id.item_textview_user_email)
    }

}