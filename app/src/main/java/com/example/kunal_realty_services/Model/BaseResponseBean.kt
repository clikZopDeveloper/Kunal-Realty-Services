package com.example.kunal_realty_services.Model


import com.google.gson.annotations.SerializedName

data class BaseResponseBean(
    @SerializedName("error")
    val error: Boolean, // false
    @SerializedName("msg")
    val msg: String
) {

}