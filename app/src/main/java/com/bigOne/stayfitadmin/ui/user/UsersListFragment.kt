package com.bigOne.stayfitadmin.ui.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bigOne.stayfitadmin.R
import com.bigOne.stayfitadmin.databinding.FragmentUsersListBinding
import com.bumptech.glide.Glide.init


class UsersListFragment : Fragment() {

    lateinit var binding: FragmentUsersListBinding

    private lateinit var mAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_users_list, container, false)
        return binding.root
    }

    init {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        initAdapter()
        observer()
    }

    private fun observer() {
        TODO("Not yet implemented")
    }

    private fun init() {
        TODO("Not yet implemented")
    }

    private fun initAdapter() {
        binding.apply {
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.setHasFixedSize(true)
            mAdapter = UserAdapter(mutableListOf(), requireContext())
            recyclerView.adapter = mAdapter
        }



            }
        }
    }


