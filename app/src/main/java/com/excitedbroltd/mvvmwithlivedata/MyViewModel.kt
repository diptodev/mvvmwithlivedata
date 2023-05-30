package com.excitedbroltd.mvvmwithlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    var count = MutableLiveData<Int>()
    val totalCount: LiveData<Int> get() = count

    init {
        count.value = 0
    }

    fun setValue() {
        count.value = (totalCount.value)?.plus(1)
    }

}