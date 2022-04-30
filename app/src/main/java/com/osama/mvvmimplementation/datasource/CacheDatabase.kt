package com.osama.mvvmimplementation.datasource

import com.osama.mvvmimplementation.data.User

object CacheDatabase {

    fun database(): MutableList<User>{
        return mutableListOf(
            User(name = "Mohamed", password = "123456"),
            User(name = "Ahmed", password = "123456"),
            User(name = "Alaa", password = "123456"),
        )
    }
}