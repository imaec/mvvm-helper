package com.imaec.mvvmhelpersample.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.imaec.mvvmhelper.ExtensionUtils.set
import com.imaec.mvvmhelper.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel : BaseViewModel() {

    private val _string = MutableLiveData<String>().set("123")
    val string: LiveData<String>
        get() = _string

    fun setString(str: String) {
        _string.value = str
    }

    fun getData(callback: () -> Unit) {
        viewModelScope.launch {
            withContext(Dispatchers.Default) {
                delay(3000)
                launch { callback() }
            }
        }
    }
}