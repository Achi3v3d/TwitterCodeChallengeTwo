package com.example.twittercodechallengetwo.twitter.challenge.model


import com.google.gson.annotations.SerializedName

data class WeatherX(
    @SerializedName("humidity")
    val humidity: Int,
    @SerializedName("pressure")
    val pressure: Int,
    @SerializedName("temp")
    val temp: Double
)