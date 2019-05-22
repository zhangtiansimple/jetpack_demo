package com.study.jetpacktest.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.jetpacktest.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_lifecycle.setOnClickListener { startActivity(Intent(this, LifeCycleActivity::class.java)) }
        btn_viewmodel.setOnClickListener { startActivity(Intent(this, ViewModelActivity::class.java)) }
        btn_paging.setOnClickListener { startActivity(Intent(this, PagingActivity::class.java)) }
        btn_navigation.setOnClickListener { startActivity(Intent(this, NavigationActivity::class.java)) }
    }
}
