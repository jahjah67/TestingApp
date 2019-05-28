package com.example.cofrethcmms.ui.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.cofrethcmms.Model.WorkOrder
import com.example.cofrethcmms.Open
import com.example.cofrethcmms.R

class RecycleViewAdapter(val context: Context, val WorkOrder: List<WorkOrder>) : RecyclerView.Adapter<RecycleViewAdapter.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val v = LayoutInflater.from(context).inflate(R.layout.workorder_list_item, parent,false)
        return Holder(v)
    }

    override fun getItemCount(): Int {
        return WorkOrder.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(WorkOrder[position], context)
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!){
        val workOrderImage = itemView?.findViewById<ImageView>(R.id.workOrderImage)
        val workOrderTitle = itemView?.findViewById<TextView>(R.id.workOrderTitle)

        fun bindCategory(WorkOrder: WorkOrder, context: Context){
            val resourceId = context.resources.getIdentifier(WorkOrder.image, "drawable", context.packageName)
            workOrderImage?.setImageResource(resourceId)
            workOrderTitle?.text = WorkOrder.title
        }
    }



}

