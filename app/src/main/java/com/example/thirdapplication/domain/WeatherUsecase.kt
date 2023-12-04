package com.example.thirdapplication.domain

import com.example.thirdapplication.data.WeatherRepository
import com.example.thirdapplication.data.remote.model.WeatherApiModel
import com.example.thirdapplication.data.remote.model.WeatherForecastApiModel

object WeatherUsecase {

    private val repo = WeatherRepository

    suspend fun getWeather(): WeatherApiModel? {
        val data = repo.getWeather()
        return data
    }

    suspend fun getWeatherForNextDay(): WeatherForecastApiModel? {
        val data = repo.getWeather()?.forecast?.get(1)
        return data
    }

}