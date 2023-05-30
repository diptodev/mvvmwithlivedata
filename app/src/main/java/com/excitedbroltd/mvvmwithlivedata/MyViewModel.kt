package com.excitedbroltd.mvvmwithlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel(startingTotal: Int) : ViewModel() {

    var count = MutableLiveData<Int>()
    val totalCount: LiveData<Int> get() = count
    var userName = MutableLiveData<String>()

    init {
        count.value = startingTotal
        userName.value = "Dipto"
    }


    fun setValue() {
        count.value = (totalCount.value)?.plus(1)
    }

}