package com.example.recyclerviewlessonapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserListAdapter(val data: MutableList<User>) : RecyclerView.Adapter<UserListAdapter.ItemViewHolder>(){
    class ItemViewHolder(val item: View): RecyclerView.ViewHolder(item){
        val textView  = item.findViewById<TextView>(R.id.textView)

        private val USER_KEY = "USER"
        lateinit var user: User

        init {
            item.setOnClickListener {
                //click handling
                val showDetailIntent = Intent(itemView.context, UserDetailActivity::class.java)
                showDetailIntent.putExtra(USER_KEY, user)
                itemView.context.startActivity(showDetailIntent)
            }

        }

        fun bind(user: User){
            this.user = user
            textView.text = user.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return  ItemViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val user = data[position]
        holder.bind(user)
        //holder.textView.text = data[position].name

    }

    override fun getItemCount(): Int {
        return data.size
    }
}