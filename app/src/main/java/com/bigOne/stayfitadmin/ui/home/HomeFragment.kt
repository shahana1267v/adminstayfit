package com.bigOne.stayfitadmin.ui.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.bigOne.stayfitadmin.R
import com.bigOne.stayfitadmin.databinding.FragmentHomeBinding
import com.bigOne.stayfitadmin.datas.model.UserData
import com.bumptech.glide.Glide
import com.google.firebase.Firebase

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observe()
        init()

    }

    private fun observe() {

    }
    private fun init()
    {
        binding.apply {
            usercardView.setOnClickListener{
                val action = HomeFragmentDirections.actionHomeFragmentToUsersListFragment()
                findNavController().navigate(action)
            }

        }
    }
}
