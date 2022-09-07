package com.ersinberkealemdaroglu.nosleepapp.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ersinberkealemdaroglu.nosleepapp.R
import com.ersinberkealemdaroglu.nosleepapp.databinding.FragmentCrateAccountBinding

class CrateAccountFragment : Fragment() {
    private lateinit var binding: FragmentCrateAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Fragment Action Bar Hide
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentCrateAccountBinding.inflate(inflater)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        choseenScreenButton()
    }

    private fun choseenScreenButton() {
        binding.signUpButton.setOnClickListener {
            findNavController().navigate(R.id.action_crateAccountFragment_to_signUpChooseFragment)
        }
    }

}