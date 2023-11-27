package com.example.thirdapplication.presentation.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.thirdapplication.R
import com.example.thirdapplication.presentation.first.WeatherListViewModel

class WeatherDetailFragment : Fragment() {

    lateinit var viewModel : WeatherDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewModel = ViewModelProvider(this).get(WeatherDetailViewModel::class.java)
        return inflater.inflate(R.layout.fragment_weather_detail, container, false)

        // init viewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val tv1 = view.findViewById<TextView>(R.id.temperature)
        val tv2 = view.findViewById<TextView>(R.id.wind)

        viewModel.tomorrowWeather.observe(viewLifecycleOwner){
            tv1.text = it?.temperature
            tv2.text = it?.wind
        }

        super.onViewCreated(view, savedInstanceState)


        val button = view.findViewById<Button>(R.id.buttonTo1)
        button.setOnClickListener{ findNavController().navigate(R.id.action_weatherDetailFragment_to_weatherListFragment)
        }
    }
}