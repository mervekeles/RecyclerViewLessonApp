package com.example.recyclerviewlessonapp

import android.content.Context

class DataSource(val context: Context) {
    fun getUserNameList(): Array<String>{
        return context.resources.getStringArray(R.array.name_array)
    }
    fun getUserAddrList(): Array<String>{
        return context.resources.getStringArray(R.array.address_array)
    }

    fun getUserProfileDescList(): Array<String>{
        return context.resources.getStringArray(R.array.profiledesc_array)
    }
}