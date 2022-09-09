package com.ersinberkealemdaroglu.nosleepapp.ui.home

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ersinberkealemdaroglu.nosleepapp.R
import com.ersinberkealemdaroglu.nosleepapp.databinding.FragmentHomeBinding
import com.ersinberkealemdaroglu.nosleepapp.ui.login.LoginActivity

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = activity?.getSharedPreferences("login", Context.MODE_PRIVATE)?: sharedPreferences

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root

    }

    override fun onStart() {
        super.onStart()
        signOut()
    }

    private fun signOut(){
        binding.button.setOnClickListener {
            sharedPreferences.edit {
                putBoolean("login", false).apply()
                startActivity(Intent(context, LoginActivity::class.java))
            }

        }
    }

}

