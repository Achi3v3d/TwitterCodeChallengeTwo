package com.example.twittercodechallengetwo.twitter.challenge.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.twittercodechallengetwo.R
import com.example.twittercodechallengetwo.databinding.FragmentWeatherBinding


class WeatherFragment : Fragment() {

    private val binding by lazy {
        FragmentWeatherBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weather, container, false)
    }

    companion object {

        fun newInstance() = WeatherFragment()
    }

}