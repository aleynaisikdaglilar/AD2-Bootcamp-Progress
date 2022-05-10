package com.info.fragmentandnavigationexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.info.fragmentandnavigationexercise.databinding.FragmentResultNotFoundBinding

class ResultNotFoundFragment : Fragment() {

    private lateinit var fragmentResultNotFoundBinding: FragmentResultNotFoundBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentResultNotFoundBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_result_not_found, container, false)
        return fragmentResultNotFoundBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentResultNotFoundBinding.button.setOnClickListener {
            findNavController().navigate(R.id.action_resultNotFoundFragment_to_noAddressYetFragment)
        }
    }
}