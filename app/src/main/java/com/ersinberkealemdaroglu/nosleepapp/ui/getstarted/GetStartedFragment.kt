package com.ersinberkealemdaroglu.nosleepapp.ui.getstarted

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ersinberkealemdaroglu.nosleepapp.R
import com.ersinberkealemdaroglu.nosleepapp.databinding.FragmentGetStartedBinding


class GetStartedFragment : Fragment() {
    private lateinit var binding: FragmentGetStartedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentGetStartedBinding.inflate(inflater)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        getStartedButtonLogin()
    }

    private fun getStartedButtonLogin() {
        binding.buttonGetStarted.setOnClickListener {
            findNavController().navigate(R.id.action_getStartedFragment_to_loginGetStartedFragment2)
        }
    }


}