package com.ersinberkealemdaroglu.nosleepapp.ui.login

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ersinberkealemdaroglu.nosleepapp.HomeActivity
import com.ersinberkealemdaroglu.nosleepapp.R
import com.ersinberkealemdaroglu.nosleepapp.data.UserDataClass
import com.ersinberkealemdaroglu.nosleepapp.data.Utils
import com.ersinberkealemdaroglu.nosleepapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private lateinit var userDataClass: UserDataClass
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = activity?.getSharedPreferences("login", Context.MODE_PRIVATE) ?: sharedPreferences
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentLoginBinding.inflate(inflater)
        return binding.root

    }

    override fun onStart() {
        super.onStart()
        loginToCreateAccountButtonNav()
        loginScreenToHomeScreenNav()

    }


    private fun loginToCreateAccountButtonNav() {
        binding.createAccountButton.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_crateAccountFragment)
        }
    }

    private fun loginScreenToHomeScreenNav() {
        userDataClass = UserDataClass("demo", "demopass")

        binding.button2.setOnClickListener {
            val usernameEditText = binding.editTextTextEmailAddress.text.toString()
            val passwordEditText = binding.editTextTextPassword.text.toString()

            if (usernameEditText == userDataClass.username && passwordEditText == userDataClass.password) {

                sharedPreferences.edit {
                    putBoolean("login", true)
                }
                context?.let { context -> Utils.backStack(context, HomeActivity()) }
                Toast.makeText(context, "giriş yapıldı", Toast.LENGTH_SHORT).show()

            }
        }
    }


}