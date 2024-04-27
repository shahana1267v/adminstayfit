package com.bigOne.stayfitadmin.ui.user

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bigOne.stayfitadmin.R
import com.bigOne.stayfitadmin.databinding.ListEachItemBinding
import com.bigOne.stayfitadmin.datas.model.UserData
import com.bumptech.glide.Glide

class UserAdapter(var mList: MutableList<UserData>, private  val context: Context) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    var onitemClickListner: OnItemClickListener? = null
    inner class UserViewHolder(private val binding: ListEachItemBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(item: UserData) {
            binding.apply {
                name.text = item.name
                mailText.text = item.email
                Glide.with(context)
                    .load(item.img)
                    .placeholder(
                        AppCompatResources.getDrawable(context,
                            R.drawable.ic_user_dp)!!)
                    .error(
                        AppCompatResources.getDrawable(context,
                            R.drawable.ic_user_dp)!!)
                    .into(binding.imageView)

            }

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = DataBindingUtil.inflate<ListEachItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.list_each_item,
            parent,
            false
        )
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val item = mList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return mList.size
    }


    fun setItems(newItems: List<UserData>) {
        mList.clear()
        mList.addAll(newItems)
        Log.e("query Adapter", mList.toString())
        notifyDataSetChanged()
    }

    interface OnItemClickListener {
        fun onClick(item: UserData)
    }
}