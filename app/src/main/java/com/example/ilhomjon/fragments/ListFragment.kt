package com.example.ilhomjon.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.ilhomjon.R
import com.example.ilhomjon.adapters.MyInfoAdapters
import com.example.ilhomjon.databinding.FragmentListBinding
import com.example.ilhomjon.models.MyInfo
import com.example.ilhomjon.utils.MyData

class ListFragment : Fragment(), MyInfoAdapters.RvAction {
    lateinit var binding: FragmentListBinding
    lateinit var myInfoAdapters: MyInfoAdapters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)

        val position = arguments?.getInt("keyPosition")

        when(position){
            0 -> myInfoAdapters = MyInfoAdapters(this, MyData.tarifList)
            1 -> myInfoAdapters = MyInfoAdapters(this, MyData.daqiqaList)
            2 -> myInfoAdapters = MyInfoAdapters(this, MyData.smsList)
            3 -> myInfoAdapters = MyInfoAdapters(this, MyData.internetList)
        }

        binding.rv.adapter = myInfoAdapters

        binding.apply {



        }

        return binding.root
    }

    override fun itemClick(myInfo: MyInfo) {

        val bundle = bundleOf("keyInfo" to myInfo)
        val listFragment = InfoFragment()
        listFragment.arguments = bundle
        parentFragmentManager.beginTransaction()
            .replace(R.id.main, listFragment)
            .commit()
    }

}