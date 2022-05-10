package com.info.fragmentandnavigationexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.info.fragmentandnavigationexercise.databinding.FragmentPageNotFoundBinding

class PageNotFoundFragment : Fragment() {

    private lateinit var fragmentPageNotFoundBinding: FragmentPageNotFoundBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentPageNotFoundBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_page_not_found, container, false)
        return fragmentPageNotFoundBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentPageNotFoundBinding.button.setOnClickListener {
            findNavController().navigate(R.id.action_pageNotFoundFragment_to_yourCartIsEmptyFragment)
        }
    }
}