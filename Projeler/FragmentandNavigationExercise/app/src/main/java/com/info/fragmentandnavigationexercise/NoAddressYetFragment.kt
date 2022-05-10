package com.info.fragmentandnavigationexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.info.fragmentandnavigationexercise.databinding.FragmentNoAddressYetBinding

class NoAddressYetFragment : Fragment() {

    private lateinit var fragmentNoAddressYetBinding: FragmentNoAddressYetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentNoAddressYetBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_no_address_yet, container, false)
        return fragmentNoAddressYetBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentNoAddressYetBinding.button.setOnClickListener {
            findNavController().navigate(R.id.action_noAddressYetFragment_to_pageNotFoundFragment)
        }
    }
}