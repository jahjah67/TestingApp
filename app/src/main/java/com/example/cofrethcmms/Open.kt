package com.example.cofrethcmms

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cofrethcmms.Model.WorkOrder
import com.example.cofrethcmms.Services.DataService
import com.example.cofrethcmms.ui.main.RecycleViewAdapter
import kotlinx.android.synthetic.main.fragment_open.*
import kotlinx.android.synthetic.main.fragment_open.view.*
import com.example.cofrethcmms.MainActivity as MainActivity

class Open(): Fragment() {

    lateinit var adapter: RecycleViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_open, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val layoutManager = LinearLayoutManager(context)
        workOrderListView.layoutManager = layoutManager
        workOrderListView.adapter = RecycleViewAdapter(activity!!.applicationContext, DataService.categories)

    }

}