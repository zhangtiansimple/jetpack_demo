package com.study.jetpacktest.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.study.jetpacktest.R
import com.study.jetpacktest.paging.GirlAdapter
import com.study.jetpacktest.room.GirlViewModel
import kotlinx.android.synthetic.main.activity_paging.*

class PagingActivity : AppCompatActivity() {

    private val viewModel by lazy(LazyThreadSafetyMode.NONE) {
        ViewModelProviders.of(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T = GirlViewModel(application) as T
        }).get(GirlViewModel::class.java)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paging)

        val adapter = GirlAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        viewModel.allGirls.observe(this, Observer {
            adapter.submitList(it)
        })
    }
}