package com.example.twittercodechallengetwo.twitter.challenge.model


import com.google.gson.annotations.SerializedName

data class Clouds(
    @SerializedName("cloudiness")
    val cloudiness: Int
)