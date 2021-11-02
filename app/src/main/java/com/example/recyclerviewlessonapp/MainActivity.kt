package com.example.recyclerviewlessonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.Serializable

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = findViewById<RecyclerView>(R.id.rv)

        rv.layoutManager = LinearLayoutManager(this)

        val users = generateDummyData(9)
        rv.adapter = UserListAdapter(users)
    }
    fun generateDummyData(n: Int):MutableList<User>{
        val names = DataSource(this).getUserNameList()
        val addr = DataSource(this).getUserAddrList()
        val profileDesc = DataSource(this).getUserProfileDescList()
        //generatedata
        val users = mutableListOf<User>()
        for (i in 0..n){
            val user = User(names[i], addr[i], profileDesc[i])
            users.add(user)
        }
        return users
    }
}

data class User(val name: String, val address: String, val profileDesc: String):Serializable