package com.info.fragmentandnavigationexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.info.fragmentandnavigationexercise.databinding.FragmentNoNotificationsYetBinding

class NoNotificationsYetFragment : Fragment() {

    private lateinit var fragmentNoNotificationsYetBinding: FragmentNoNotificationsYetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentNoNotificationsYetBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_no_notifications_yet, container, false)
        return fragmentNoNotificationsYetBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentNoNotificationsYetBinding.button.setOnClickListener {
            findNavController().navigate(R.id.action_noNotificationsYetFragment_to_noMessagesFragment)
        }
    }
}