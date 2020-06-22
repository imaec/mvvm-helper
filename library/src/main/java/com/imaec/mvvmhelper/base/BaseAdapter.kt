package com.imaec.mvvmhelper.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    protected val TAG = this::class.java.simpleName
    protected val listItem = ArrayList<Any>()

    protected lateinit var binding: ViewDataBinding

    override fun getItemCount(): Int = listItem.size

    fun addItem(item: Any) {
        listItem.add(item)
    }

    fun addItems(list: ArrayList<Any>) {
        listItem.addAll(list)
    }

    fun clearItem() {
        listItem.clear()
    }

    fun getItem(position: Int): Any = listItem[position]
}