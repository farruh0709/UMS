package com.example.ilhomjon.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.ilhomjon.R
import com.example.ilhomjon.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.apply {

            btnTariflar.setOnClickListener {
                val bundle = bundleOf("keyPosition" to 0)
                val listFragment = ListFragment()
                listFragment.arguments = bundle
                parentFragmentManager.beginTransaction()
                    .replace(R.id.main, listFragment)
                    .commit()
            }

            btnDaqiqalar.setOnClickListener {
                val bundle = bundleOf("keyPosition" to 1)
                val listFragment = ListFragment()
                listFragment.arguments = bundle
                parentFragmentManager.beginTransaction()
                    .replace(R.id.main, listFragment)
                    .commit()
            }

            btnSms.setOnClickListener {
                val bundle = bundleOf("keyPosition" to 2)
                val listFragment = ListFragment()
                listFragment.arguments = bundle
                parentFragmentManager.beginTransaction()
                    .replace(R.id.main, listFragment)
                    .commit()
            }

            btnInternet.setOnClickListener {
                val bundle = bundleOf("keyPosition" to 3)
                val listFragment = ListFragment()
                listFragment.arguments = bundle
                parentFragmentManager.beginTransaction()
                    .replace(R.id.main, listFragment)
                    .commit()
            }

        }


        return binding.root
    }

}