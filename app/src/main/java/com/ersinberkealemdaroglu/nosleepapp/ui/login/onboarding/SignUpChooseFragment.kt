package com.ersinberkealemdaroglu.nosleepapp.ui.login.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ersinberkealemdaroglu.nosleepapp.R
import com.ersinberkealemdaroglu.nosleepapp.databinding.FragmentSignUpChooseBinding

class SignUpChooseFragment : Fragment() {
    private lateinit var binding: FragmentSignUpChooseBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentSignUpChooseBinding.inflate(inflater)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        choseenToNotification()
    }

    private fun choseenToNotification() {
        binding.button96.setOnClickListener {
            findNavController().navigate(R.id.action_signUpChooseFragment_to_signUpNotificationFragment)
        }
    }

}