package com.imaec.mvvmhelpersample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.imaec.mvvmhelper.base.BaseAdapter
import com.imaec.mvvmhelper.base.BaseViewHolder
import com.imaec.mvvmhelpersample.databinding.ItemMainBinding

class MainAdapter : BaseAdapter() {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        binding = ItemMainBinding.inflate(LayoutInflater.from(parent.context))
        return ItemViewHolder(binding as ItemMainBinding)
    }

    inner class ItemViewHolder(binding: ItemMainBinding) : BaseViewHolder(binding) {

        override fun onBind(item: Any) {

        }
    }
}