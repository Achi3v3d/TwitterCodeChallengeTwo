package com.example.twittercodechallengetwo.twitter.challenge.rest

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

interface WeatherRepository {
    val weatherResponse: StateFlow<UIState>
    suspend fun getWeatherToDay()

}
class WeatherRepositoryImpl(
   private val networkApi: NetworkApi
):WeatherRepository{

    private var _weatherResponse: MutableStateFlow<UIState> = MutableStateFlow(UIState.LOADING())
    override val weatherResponse: StateFlow<UIState>
        get() = _weatherResponse

    override suspend fun getWeatherToDay() {
        // clears UIState ERROR
        _weatherResponse.value = UIState.LOADING()

        try {
            val response = networkApi.getWeather()
            if(response.isSuccessful){
                response.body()?.let { body ->
                    _weatherResponse.value = UIState.SUCCESS(body)
                } ?: UIState.ERROR(Throwable("Response is null"))


            }else{
                UIState.ERROR(Throwable(response.errorBody()?.string()))
            }
        }catch (e:Exception){
            UIState.ERROR(e)
        }

    }

}