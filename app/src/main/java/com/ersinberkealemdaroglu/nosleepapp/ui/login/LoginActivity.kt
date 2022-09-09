package com.ersinberkealemdaroglu.nosleepapp.ui.login

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.ersinberkealemdaroglu.nosleepapp.HomeActivity
import com.ersinberkealemdaroglu.nosleepapp.R
import com.ersinberkealemdaroglu.nosleepapp.data.Utils
import com.ersinberkealemdaroglu.nosleepapp.databinding.ActivityLoginBinding
import com.ersinberkealemdaroglu.nosleepapp.ui.getstarted.LoginGetStartedFragmentDirections

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private var isLogin : Boolean = false
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE)
        isLogin()
    }

    private fun isLogin() {
        isLogin = sharedPreferences.getBoolean("login", isLogin)
        if (isLogin){
            Utils.backStack(this, HomeActivity())
            Toast.makeText(this, "kullanıcı girdi", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "giremedi", Toast.LENGTH_SHORT).show()
        }

    }


}