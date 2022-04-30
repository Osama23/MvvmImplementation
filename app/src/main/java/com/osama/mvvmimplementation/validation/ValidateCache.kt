package com.osama.mvvmimplementation.validation

import com.osama.mvvmimplementation.data.User
import com.osama.mvvmimplementation.datasource.CacheDatabase
import java.lang.IllegalArgumentException

class ValidateCache {

    var database = CacheDatabase.database()
    fun validateCache(): MutableList<User> {
        return if (database.isNullOrEmpty()) throw IllegalArgumentException("There is no data") else database
    }
}