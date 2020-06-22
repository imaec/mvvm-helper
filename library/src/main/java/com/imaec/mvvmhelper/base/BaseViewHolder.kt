package com.imaec.mvvmhelper.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

    open fun onBind() {

    }

    open fun onBind(item: Any) {

    }
}