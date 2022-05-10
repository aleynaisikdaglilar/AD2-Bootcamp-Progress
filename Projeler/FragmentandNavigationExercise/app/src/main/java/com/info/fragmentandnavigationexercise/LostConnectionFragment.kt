package com.info.fragmentandnavigationexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.info.fragmentandnavigationexercise.databinding.FragmentLostConnectionBinding

class LostConnectionFragment : Fragment() {

    private lateinit var fragmentLostConnectionBinding: FragmentLostConnectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentLostConnectionBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_lost_connection, container, false)
        return fragmentLostConnectionBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentLostConnectionBinding.button.setOnClickListener{
            findNavController().navigate(R.id.action_lostConnectionFragment_to_resultNotFoundFragment)
        }
    }
}