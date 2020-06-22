package com.imaec.mvvmhelper.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T: ViewDataBinding>(private val binding: T) : RecyclerView.ViewHolder(binding.root) {

    abstract fun onBind()
    abstract fun onBind(item: Any)
}