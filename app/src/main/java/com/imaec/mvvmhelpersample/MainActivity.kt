package com.imaec.mvvmhelpersample

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import com.imaec.mvvmhelper.ExtensionUtils.getViewModel
import com.imaec.mvvmhelper.base.BaseActivity
import com.imaec.mvvmhelpersample.databinding.ActivityMainBinding
import com.imaec.mvvmhelpersample.viewModel.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val viewModel by lazy { getViewModel { MainViewModel() } }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.apply {
            lifecycleOwner = this@MainActivity
            viewModel = this@MainActivity.viewModel
        }

        viewModel.string.observe(this, Observer {
            Log.d(TAG, "    ## $it")
        })
        viewModel.getData {
            Log.d(TAG, "    ## getData()")
        }
    }

    fun onClick(view: View) {
        if (view.id == R.id.button) {
            if (viewModel.string.value == "123") {
                viewModel.setString("321")
            } else {
                viewModel.setString("123")
            }
        }
    }
}
