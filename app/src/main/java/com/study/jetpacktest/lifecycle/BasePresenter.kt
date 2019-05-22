package com.study.jetpacktest.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner

open class BasePresenter : IPresenter {

    val TAG = "BasePresenter"

    override fun onCreate(owner: LifecycleOwner) {
        Log.e(TAG, "BasePresenter onCreate")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.e(TAG, "BasePresenter onDestroy")
    }

    override fun onLifecycleChanged(owner: LifecycleOwner, event: Lifecycle.Event) {
    }
}