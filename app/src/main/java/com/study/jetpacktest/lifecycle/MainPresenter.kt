package com.study.jetpacktest.lifecycle

import android.util.Log
import androidx.lifecycle.LifecycleOwner

class MainPresenter : BasePresenter() {

    override fun onCreate(owner: LifecycleOwner) {
        Log.e(TAG, "MainPresenter onCreate");
        super.onCreate(owner)
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.e(TAG, "MainPresenter onDestroy");
        super.onDestroy(owner)
    }
}