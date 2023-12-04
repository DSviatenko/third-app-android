package com.example.thirdapplication.presentation.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.thirdapplication.data.remote.model.WeatherApiModel
import com.example.thirdapplication.data.remote.model.WeatherForecastApiModel
import com.example.thirdapplication.domain.WeatherUsecase
import kotlinx.coroutines.launch

class WeatherDetailViewModel : ViewModel(){

    private val weatherUsecase = WeatherUsecase

    val tomorrowWeather = MutableLiveData<WeatherForecastApiModel?>()
    val isLoading = MutableLiveData<Boolean>()

    init {
        getAllData()
    }

    fun getAllData() {
        viewModelScope.launch {
            isLoading.postValue(true)

            val data = weatherUsecase.getWeatherForNextDay()
            tomorrowWeather.postValue(data)

            isLoading.postValue(false)
        }
    }
}