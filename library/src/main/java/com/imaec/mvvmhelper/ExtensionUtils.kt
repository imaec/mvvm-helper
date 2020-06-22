package com.imaec.mvvmhelper

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.imaec.mvvmhelper.base.BaseViewModelFactory

object ExtensionUtils {

    inline fun <reified V : ViewModel> AppCompatActivity.getViewModel(noinline creator: (() -> V)?) : V {
        creator?.let {
            return ViewModelProvider(this,
                BaseViewModelFactory(creator)
            ).get(V::class.java)
        }
        return ViewModelProviders.of(this).get(V::class.java)
    }

    fun <T : Any> MutableLiveData<T>.set(value: T) : MutableLiveData<T> {
        this.value = value
        return this
    }
}