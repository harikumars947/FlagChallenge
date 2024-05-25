package com.example.example

import com.google.gson.annotations.SerializedName


data class RootQuestions (

  @SerializedName("questions" ) var questions : ArrayList<Questions> = arrayListOf()

)