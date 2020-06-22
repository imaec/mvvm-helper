package com.imaec.mvvmhelper.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel

abstract class BaseViewModel : ViewModel() {

    protected val TAG = this::class.java.simpleName
    private val job = Job()
    protected val viewModelScope = CoroutineScope(Dispatchers.Main + job)

    override fun onCleared() {
        viewModelScope.cancel()
        super.onCleared()
    }
}