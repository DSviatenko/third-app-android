package com.example.thirdapplication.data

import com.example.thirdapplication.data.remote.ApiFactory
import com.example.thirdapplication.data.remote.model.WeatherApiModel

object WeatherRepository {
    private val api = ApiFactory.weatherApi

    suspend fun getWeather() : WeatherApiModel? {

        val dataFromInternet = api.getWeather()

        if (dataFromInternet.isSuccessful && dataFromInternet.body()!=null) {
            return dataFromInternet.body()
        } else return null
    }
}