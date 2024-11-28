package com.example.neurasecure

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.neurasecure.databinding.FragmentUrlcheckerBinding


class urlchecker : Fragment() {

    private lateinit var binding : FragmentUrlcheckerBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentUrlcheckerBinding.inflate(inflater,container,false)


        return binding.root
    }


}