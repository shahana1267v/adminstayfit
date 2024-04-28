package com.bigOne.stayfitadmin.ui.trainer

import android.content.Context
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bigOne.stayfitadmin.R
import com.bigOne.stayfitadmin.databinding.FragmentUsersListBinding
import com.bigOne.stayfitadmin.datas.model.UserData
import com.bigOne.stayfitadmin.ui.home.MainViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class TrainersListFragment : Fragment() {

    lateinit var binding: FragmentUsersListBinding

    private lateinit var mAdapter: TrainerAdapter
    private val mainViewModel: MainViewModel by activityViewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_users_list, container, false)
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
        mainViewModel.getUsersList().observe(viewLifecycleOwner) {
            val trainers = it.filter { user -> user.isTrainer }
            mAdapter.setItems(trainers)
        }
    }

    private fun getUsersList() {


    }

    private fun init() {
        binding.toolbar.title = "Trainers List"
        binding.toolbar.setNavigationOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun initAdapter() {
        binding.apply {
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.setHasFixedSize(true)
            mAdapter = TrainerAdapter(mutableListOf(), requireContext())
            recyclerView.adapter = mAdapter

            mAdapter.onitemClickListner = object : TrainerAdapter.OnItemClickListener {
                override fun onClick(item: UserData) {
                    Toast.makeText(requireContext(), "${item.name}", Toast.LENGTH_SHORT).show()
                    if (!item.approved) {

                        val context: Context =
                            ContextThemeWrapper(requireContext(), R.style.DialogStyle)
                        MaterialAlertDialogBuilder(context)
                            .setMessage("Do you want to approved?")
                            .setCancelable(false)
                            .setNeutralButton(resources.getString(R.string.general_no)) { _, _ ->


                            }
                            .setPositiveButton(resources.getString(R.string.general_yes)) { _, _ ->

                                mainViewModel.approvedTrainer(item.id).observe(viewLifecycleOwner) {
                                    Toast.makeText(requireContext(), "Sucess", Toast.LENGTH_SHORT)
                                        .show()
                                    binding.toolbar.visibility = View.GONE

                                }
                                }.show()

                            }
                    }
                }
            }
        }
    }







