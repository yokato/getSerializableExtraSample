package com.example.myviewmodel.ui.main

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myviewmodel.Car
import com.example.myviewmodel.DiscoveredCar
import com.example.myviewmodel.R
import com.example.myviewmodel.SecondActivity

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
        val intent = Intent(activity, SecondActivity::class.java)
        var car = DiscoveredCar()
        intent.putExtra("string", "hoge")
        intent.putExtra("car", car)
        startActivity(intent)
    }

}