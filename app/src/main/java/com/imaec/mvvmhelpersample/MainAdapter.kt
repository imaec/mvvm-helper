package com.imaec.mvvmhelpersample

//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.imaec.mvvmhelper.base.BaseAdapter
//import com.imaec.mvvmhelper.base.BaseViewHolder
//import com.imaec.mvvmhelpersample.databinding.ItemMainBinding
//
//class MainAdapter : BaseAdapter() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        binding = ItemMainBinding.inflate(LayoutInflater.from(parent.context))
//        return ItemViewHolder(binding as ItemMainBinding)
//    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        if (holder is ItemViewHolder) {
//            holder.onBind(listItem[position] as String)
//        }
//    }
//
//    inner class ItemViewHolder(binding: ItemMainBinding) : BaseViewHolder<String>(binding) {
//
//        override fun onBind(item: String) {
//            super.onBind(item)
//        }
//    }
//}