package com.example.thirdapplication.data.remote

import com.example.thirdapplication.data.remote.model.WeatherApiModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface WeatherApiInterface {

    @GET("kyiv")
    suspend fun getWeather(): Response<WeatherApiModel>

//    @GET("kyiv")
//    suspend fun getWeather(@QueryMap params: Map<String, String>): Response<WeatherApiModel>
}