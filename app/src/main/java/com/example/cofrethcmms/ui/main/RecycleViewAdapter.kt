package com.example.cofrethcmms.ui.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import com.example.cofrethcmms.Model.WorkOrder
import com.example.cofrethcmms.R

class RecycleViewAdapter(val context: Context, val WorkOrder: List<WorkOrder>) : RecyclerView.Adapter<RecycleViewAdapter.Holder>(){

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!){
        val WorkOrderImage = itemView?.findViewById<ImageView>(R.id.WorkOrderName)
    }

}