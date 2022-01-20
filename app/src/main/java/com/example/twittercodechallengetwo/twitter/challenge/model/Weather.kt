package com.example.twittercodechallengetwo.twitter.challenge.model


import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("clouds")
    val clouds: Clouds,
    @SerializedName("coord")
    val coord: Coord,
    @SerializedName("name")
    val name: String,
    @SerializedName("rain")
    val rain: Rain,
    @SerializedName("weather")
    val weather: WeatherX,
    @SerializedName("wind")
    val wind: Wind
)