package com.ersinberkealemdaroglu.nosleepapp.ui.login.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ersinberkealemdaroglu.nosleepapp.R
import com.ersinberkealemdaroglu.nosleepapp.databinding.FragmentSignUpNotificationBinding

class SignUpNotificationFragment : Fragment() {
    private lateinit var binding: FragmentSignUpNotificationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentSignUpNotificationBinding.inflate(inflater)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        homeFragmentButton()
    }

    private fun homeFragmentButton() {
        binding.buttonNOTI.setOnClickListener {
            findNavController().navigate(R.id.home_nav_graph)
        }
    }

}