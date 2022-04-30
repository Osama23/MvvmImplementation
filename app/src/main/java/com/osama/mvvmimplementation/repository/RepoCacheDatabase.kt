package com.osama.mvvmimplementation.repository

import android.util.Log
import com.osama.mvvmimplementation.data.User
import com.osama.mvvmimplementation.validation.ValidateCache

// Here we should use any framework that uses dagger to inject object
class RepoCacheDatabase {

    private val validateDatabase: ValidateCache = ValidateCache()

    fun insertUser(user: User){
        validateDatabase.validateCache().add(user)
    }

    fun deleteUser(){
        validateDatabase.validateCache().removeLast()
    }

    fun getAllUsers(): MutableList<User> {
        return validateDatabase.validateCache()
    }

    fun printAllUsers() {
        Log.d("AllData", validateDatabase.validateCache().toString())
    }
}