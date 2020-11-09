package com.example.recyclerviewuser.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewuser.R
import com.example.recyclerviewuser.model.GenderType
import com.example.recyclerviewuser.model.RandomUser
import com.squareup.picasso.Picasso

class RandomUserAdapter(var randomUser: RandomUser?):RecyclerView.Adapter<RandomUserAdapter.RandomUserViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RandomUserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_layout,parent,false)
        return RandomUserViewHolder(view)
    }

    override fun onBindViewHolder(holder: RandomUserViewHolder, position: Int) {

        val user = randomUser?.results?.get(position)

        holder.userName.text = "${user?.name?.title} ${user?.name?.first} ${user?.name?.last}"
        holder.userEmail.text = user?.email
        holder.userPhone.text = user?.phone
        Picasso.get().load(user?.picture?.medium).into(holder.userAvatar);


    }

    override fun getItemCount(): Int {
        return randomUser?.results?.size?:0
    }


    class RandomUserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val userAvatar: ImageView = view.findViewById(R.id.item_imageview_user_avatar)
        val userName: TextView = view.findViewById(R.id.item_textview_user_name)
        val userPhone: TextView = view.findViewById(R.id.item_textview_user_phone)
        val userEmail: TextView = view.findViewById(R.id.item_textview_user_email)

    }

}