package com.study.jetpacktest.viewmodel_livedata

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel() : ViewModel() {

    private var title: MutableLiveData<String>? = null

    public fun getTitle(): MutableLiveData<String> {
        if (title == null) {
            title = MediatorLiveData<String>()
            loadTitle()
        }
        return title as MutableLiveData<String>
    }

    private fun loadTitle() {
        title!!.setValue("load title success")
    }
}