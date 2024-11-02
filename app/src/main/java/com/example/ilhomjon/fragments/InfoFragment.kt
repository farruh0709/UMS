package com.example.ilhomjon.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ilhomjon.R
import com.example.ilhomjon.databinding.FragmentInfoBinding
import com.example.ilhomjon.models.MyInfo

class InfoFragment : Fragment() {

    var binding: FragmentInfoBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInfoBinding.inflate(layoutInflater)

        val myInfo = arguments?.getSerializable("keyInfo") as MyInfo
        binding!!.tvInfo.text = myInfo.toString()

        return binding!!.root
    }

}