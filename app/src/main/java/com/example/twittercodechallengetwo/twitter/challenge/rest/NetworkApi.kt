package com.example.twittercodechallengetwo.twitter.challenge.rest

import com.example.twittercodechallengetwo.twitter.challenge.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface NetworkApi {
    @GET(CURRENT)
    suspend fun getWeather(): Response<Weather>

    companion object{
        const val BASE_URL = "https://twitter-code-challenge.s3.amazonaws.com/"
        private const val CURRENT = "current.json"
        private const val FUTURE =  "future_1.json"
    }
}
