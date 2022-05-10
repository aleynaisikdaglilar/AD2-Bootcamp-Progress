package com.info.fragmentandnavigationexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.info.fragmentandnavigationexercise.databinding.FragmentYourCartIsEmptyBinding

class YourCartIsEmptyFragment : Fragment() {

    private lateinit var fragmentYourCartIsEmptyBinding: FragmentYourCartIsEmptyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentYourCartIsEmptyBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_your_cart_is_empty, container, false)
        return fragmentYourCartIsEmptyBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentYourCartIsEmptyBinding.button.setOnClickListener {
            findNavController().navigate(R.id.action_yourCartIsEmptyFragment_to_noNotificationsYetFragment)
        }
    }
}