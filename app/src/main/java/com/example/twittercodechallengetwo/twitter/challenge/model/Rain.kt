package com.example.twittercodechallengetwo.twitter.challenge.model


import com.google.gson.annotations.SerializedName

data class Rain(
    @SerializedName("3h")
    val h: Int
)