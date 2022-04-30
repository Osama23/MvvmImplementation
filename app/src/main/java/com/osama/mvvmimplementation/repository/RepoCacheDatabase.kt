package com.osama.mvvmimplementation.repository

import android.util.Log
import com.osama.mvvmimplementation.data.User
import com.osama.mvvmimplementation.validation.ValidateCache
import javax.inject.Inject

// the constructor should contain instance of retrofit
class RepoCacheDatabase @Inject constructor(){

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