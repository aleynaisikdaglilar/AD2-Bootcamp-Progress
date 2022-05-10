package com.info.fragmentandnavigationexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.info.fragmentandnavigationexercise.databinding.FragmentNoFavouritesBinding

class NoFavouritesFragment : Fragment() {

    private lateinit var fragmentNoFavouritesBinding: FragmentNoFavouritesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentNoFavouritesBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_no_favourites, container, false)
        return fragmentNoFavouritesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentNoFavouritesBinding.button.setOnClickListener {
            findNavController().navigate(R.id.action_noFavouritesFragment_to_lostConnectionFragment)
        }
    }
}