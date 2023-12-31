package com.example.thirdapplication.presentation.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.thirdapplication.R

class WeatherListFragment : Fragment() {

    lateinit var viewModel : WeatherListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewModel = ViewModelProvider(this).get(WeatherListViewModel::class.java)

        return inflater.inflate(R.layout.fragment_weather_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //place for code
        val tv1 = view.findViewById<TextView>(R.id.tv1)
        val tv2 = view.findViewById<TextView>(R.id.tv2)
        val tv3 = view.findViewById<TextView>(R.id.tv3)

        viewModel.weatherLd.observe(viewLifecycleOwner){
            tv1.text = it?.temperature
            tv2.text = it?.wind
            tv3.text = it?.description
        }

        val button = view.findViewById<Button>(R.id.button2)
            button.setOnClickListener{ findNavController().navigate(R.id.action_weatherListFragment_to_weatherDetailFragment)
        }
    }
}