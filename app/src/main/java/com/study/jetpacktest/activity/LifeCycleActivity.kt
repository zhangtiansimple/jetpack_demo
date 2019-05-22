package com.study.jetpacktest.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.study.jetpacktest.R
import com.study.jetpacktest.lifecycle.IPresenter
import com.study.jetpacktest.lifecycle.MainPresenter

class LifeCycleActivity : AppCompatActivity() {
    private val TAG = "LifeCycleActivity"
    private var mPresenter: IPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycler)

        Log.e(TAG, "LifeCycleActivity onCreate")
        mPresenter = MainPresenter()
        getLifecycle().addObserver(mPresenter as MainPresenter);
    }

    override fun onDestroy() {
        Log.e(TAG, "LifeCycleActivity onDestroy")
        super.onDestroy()
    }
}