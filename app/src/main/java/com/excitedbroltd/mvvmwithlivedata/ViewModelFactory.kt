package com.excitedbroltd.mvvmwithlivedata

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(private val startingTotal: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MyViewModel::class.java)) {
            return MyViewModel(startingTotal) as T
        }
        throw java.lang.IllegalArgumentException("There is some error occur")
    }
}