package com.example.recyclerviewlessonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.recyclerviewlessonapp.databinding.ActivityUserDetailBinding

class UserDetailActivity : AppCompatActivity() {
    private val USER_KEY = "USER"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_user_detail)

        val binding: ActivityUserDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_user_detail)
        val selectedUser = intent.getSerializableExtra(USER_KEY) as User

        binding.user = selectedUser

    }
}