package com.example.twittercodechallengetwo.twitter.challenge.rest

import com.example.twittercodechallengetwo.twitter.challenge.model.Weather

sealed class UIState {

    class LOADING(val isLoading: Boolean = true) : UIState()
    class SUCCESS(val weather: Weather) : UIState()
    class ERROR(val error: Throwable): UIState()
}
