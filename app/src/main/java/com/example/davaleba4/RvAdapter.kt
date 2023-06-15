package com.example.davaleba4

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(private val userList : ArrayList<User>) : RecyclerView.Adapter<RvAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RvAdapter.MyViewHolder, position: Int) {

        val user : User = userList[position]
        holder.firstname.text = user.fName
        holder.lastname.text = user.lName
        holder.age.text = user.age.toString()

    }

    override fun getItemCount(): Int {

        return userList.size
    }

    public class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val firstname : TextView = itemView.findViewById(R.id.tvFirstName)
        val lastname : TextView = itemView.findViewById(R.id.tvLastName)
        val age : TextView = itemView.findViewById(R.id.tvAge)

    }
}