package com.study.jetpacktest.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.study.jetpacktest.R
import com.study.jetpacktest.viewmodel_livedata.MyViewModel
import kotlinx.android.synthetic.main.activity_viewmodel.*

class ViewModelActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)

        viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)
        viewModel.getTitle().observe(this, Observer {
            tv_viewmodel.setText(it)
        })
    }
}