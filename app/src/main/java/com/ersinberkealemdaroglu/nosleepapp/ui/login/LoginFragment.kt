package com.ersinberkealemdaroglu.nosleepapp.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ersinberkealemdaroglu.nosleepapp.R
import com.ersinberkealemdaroglu.nosleepapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Fragment Action Bar Hide
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
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
        binding.button2.setOnClickListener {

            findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }
    }

}