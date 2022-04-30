package com.osama.mvvmimplementation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.osama.mvvmimplementation.data.User
import com.osama.mvvmimplementation.repository.RepoCacheDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repoCacheDatabase: RepoCacheDatabase) :
    ViewModel() {

    private var usersMutalbleLiveData = MutableLiveData<List<User>>()

    val usersLiveData: LiveData<List<User>> = usersMutalbleLiveData

    init {
        usersMutalbleLiveData.value = repoCacheDatabase.getAllUsers()
    }
}