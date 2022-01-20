package com.example.twittercodechallengetwo.twitter.challenge.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.twittercodechallengetwo.R

class FutureWeatherFragment : Fragment() {
    private  val binding by lazy{

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_future_weather, container, false)
    }

    companion object {

        fun newInstance() = FutureWeatherFragment()

    }
}