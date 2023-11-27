package com.example.thirdapplication.data.remote.model

data class WeatherApiModel (
    val temperature: String,
    val wind: String,
    val description: String,
    val forecast: List<WeatherForecastApiModel>
)

//{
//    "temperature": "0 °C",
//    "wind": "30 km/h",
//    "description": "Blizzard",
//    "forecast": [
//    {
//        "day": "1",
//        "temperature": "+1 °C",
//        "wind": "22 km/h"
//    },
//    {
//        "day": "2",
//        "temperature": "-4 °C",
//        "wind": "52 km/h"
//    },
//    {
//        "day": "3",
//        "temperature": "-5 °C",
//        "wind": "13 km/h"
//    }
//    ]
//}