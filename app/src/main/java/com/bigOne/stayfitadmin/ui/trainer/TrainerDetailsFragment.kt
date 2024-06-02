package com.bigOne.stayfitadmin.ui.trainer

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.ContextThemeWrapper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.bigOne.stayfitadmin.R
import com.bigOne.stayfitadmin.databinding.FragmentHomeBinding
import com.bigOne.stayfitadmin.databinding.FragmentTrainerDetailsBinding
import com.bigOne.stayfitadmin.ui.home.MainViewModel
import com.bigOne.stayfitadmin.ui.user.UserAdapter
import com.bumptech.glide.Glide
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth


class TrainerDetailsFragment : Fragment() {
    lateinit var binding: FragmentTrainerDetailsBinding
    private lateinit var mAdapter: UserAdapter
    private val mainViewModel: MainViewModel by activityViewModels()
    var onitemClickListner: TrainerAdapter.OnItemClickListener? = null

    private  val args:TrainerDetailsFragmentArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_trainer_details, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       init()

    }



    private fun init()
    {
        val details =args.userData

        binding.accName.text = details?.name.toString()
        binding.accEmail.text = details?.email.toString()
        if (details?.img != null) {
            Glide.with(this)
                .load(details.img)
                .placeholder(
                    AppCompatResources.getDrawable(
                        requireContext(),
                        R.drawable.ic_user_dp
                    )!!
                )
                .error(
                    AppCompatResources.getDrawable(
                        requireContext(),
                        R.drawable.ic_user_dp
                    )!!
                )
                .into(binding.accImage)

        }

        binding.Qualification.text=details.qualification
        binding.Experience.text=details.experience

        if (details.approved) {

         binding.approveText.text = "Approved"
        }
            else
            {
             binding.approveText.text="Requested"
            }





        binding.approveText.setOnClickListener {


            if (!details.approved) {
                val context: Context = ContextThemeWrapper(requireContext(), R.style.DialogStyle)
                MaterialAlertDialogBuilder(context)
                    .setMessage("Do you want to approved?")
                    .setCancelable(false)
                    .setNeutralButton(resources.getString(R.string.general_no)) { _, _ ->


                    }
                    .setPositiveButton(resources.getString(R.string.general_yes)) { _, _ ->

                        mainViewModel.approvedTrainer(details.id.toString()).observe(viewLifecycleOwner) {
                            if(it)
                            Toast.makeText(requireContext(), "Success", Toast.LENGTH_SHORT).show()

                        }
                    }.show()

            }

        }




    }


        }



