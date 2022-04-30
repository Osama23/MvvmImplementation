package com.osama.mvvmimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import com.osama.mvvmimplementation.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()
    private lateinit var userText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userText = findViewById<TextView>(R.id.user_text)

        mainViewModel.usersLiveData.observe(this) { users ->
            users.forEach { user ->
                userText.text = user.name
            }

        }
    }
}