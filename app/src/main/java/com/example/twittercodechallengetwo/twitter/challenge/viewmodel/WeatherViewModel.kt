package com.example.twittercodechallengetwo.twitter.challenge.viewmodel

import android.provider.Contacts
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.twittercodechallengetwo.twitter.challenge.rest.UIState
import com.example.twittercodechallengetwo.twitter.challenge.rest.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val repository: WeatherRepository,
    // io Dispatcher for the worker thead
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO,
    private var weatherjob: Job = SupervisorJob(),
    private val  coroutineScope: CoroutineScope = CoroutineScope(weatherjob + ioDispatcher)

): ViewModel() {

    private var _weatherLiveData: MutableLiveData<UIState> = MutableLiveData(UIState.LOADING())

    val weatherTemp: LiveData<UIState>get() = _weatherLiveData

    private fun subscribeToWeatherResponse(){

         weatherjob =  coroutineScope.launch {

            repository.getWeatherToDay()
        }
    }
    private fun collectWeatherResponse(){
        // live data in the worker thread is being posted
        coroutineScope.launch {
            repository.weatherResponse.collect{ uiState ->
                when(uiState){
                    is UIState.LOADING-> { _weatherLiveData.postValue(uiState)}
                    is UIState.SUCCESS-> { _weatherLiveData.postValue(uiState)}
                    is UIState.ERROR-> { _weatherLiveData.postValue(uiState)}
                }
            }
        }
    }


}