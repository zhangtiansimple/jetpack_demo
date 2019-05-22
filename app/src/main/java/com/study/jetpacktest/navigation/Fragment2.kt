package com.study.jetpacktest.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.study.jetpacktest.R
import kotlinx.android.synthetic.main.fragment2.*

class Fragment2 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_return.setOnClickListener { Navigation.findNavController(it).navigateUp() }
        btn_go.setOnClickListener { Navigation.findNavController(it).navigate(R.id.action_page3) }
    }
}