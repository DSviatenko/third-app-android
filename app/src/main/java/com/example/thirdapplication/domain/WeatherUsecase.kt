package com.example.thirdapplication.domain

import com.example.thirdapplication.data.WeatherRepository
import com.example.thirdapplication.data.remote.model.WeatherApiModel

object WeatherUsecase {

    private val repo = WeatherRepository

    suspend fun getWeather(): WeatherApiModel? {
        val data = repo.getWeather()
        return data
    }

}