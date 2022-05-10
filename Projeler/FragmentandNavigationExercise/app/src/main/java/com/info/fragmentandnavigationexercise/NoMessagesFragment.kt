package com.info.fragmentandnavigationexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.info.fragmentandnavigationexercise.databinding.FragmentNoMessagesBinding

class NoMessagesFragment : Fragment() {

    private lateinit var fragmentNoMessagesBinding: FragmentNoMessagesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentNoMessagesBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_no_messages, container, false)
        return fragmentNoMessagesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentNoMessagesBinding.button.setOnClickListener {
            findNavController().navigate(R.id.action_noMessagesFragment_to_noFavouritesFragment)
        }
    }
}