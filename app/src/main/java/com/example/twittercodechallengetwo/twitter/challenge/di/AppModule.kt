package com.example.twittercodechallengetwo.twitter.challenge.di

import com.example.twittercodechallengetwo.twitter.challenge.rest.NetworkApi
import com.example.twittercodechallengetwo.twitter.challenge.rest.WeatherRepository
import com.example.twittercodechallengetwo.twitter.challenge.rest.WeatherRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {
    @Provides
    @Singleton
    fun providesWeatherRepo(networkApi: NetworkApi) = WeatherRepositoryImpl(networkApi)
}