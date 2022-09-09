package com.ersinberkealemdaroglu.nosleepapp.ui.getstarted

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ersinberkealemdaroglu.nosleepapp.R
import com.ersinberkealemdaroglu.nosleepapp.databinding.FragmentLoginGetStartedBinding

class LoginGetStartedFragment : Fragment() {
    private lateinit var binding: FragmentLoginGetStartedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentLoginGetStartedBinding.inflate(inflater)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        getStartedLoginScreenNav()
    }

    private fun getStartedLoginScreenNav() {
        binding.loginGetStartedButton.setOnClickListener {
            findNavController().navigate(R.id.action_loginGetStartedFragment_to_loginFragment2)
        }
    }

}