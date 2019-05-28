package com.example.cofrethcmms.Services

import com.example.cofrethcmms.Model.WorkOrder

object DataService {

    val categories = listOf(
        WorkOrder("Chiller","chiller"),
        WorkOrder("ahu","ahu"),
        WorkOrder("plumbing","plumbing")
    )
}