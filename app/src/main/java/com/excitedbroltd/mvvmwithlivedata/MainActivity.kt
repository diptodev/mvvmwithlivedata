package com.excitedbroltd.mvvmwithlivedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.excitedbroltd.mvvmwithlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MyViewModel
    private lateinit var viewModelFactory: ViewModelFactory
    var count = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = ViewModelFactory(23)
        viewModel = ViewModelProvider(this, viewModelFactory)[MyViewModel::class.java]
        binding.myviewmodel = viewModel
        binding.lifecycleOwner = this
    }
}