package com.example.example

import com.google.gson.annotations.SerializedName


data class Countries (

  @SerializedName("country_name" ) var countryName : String? = null,
  @SerializedName("id"           ) var id          : Int?    = null

)