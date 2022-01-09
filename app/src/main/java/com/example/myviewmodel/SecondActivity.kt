package com.example.myviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myviewmodel.ui.main.MainFragment

class SecondActivity : AppCompatActivity() {

    private val TAG: String? = SecondActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.container, MainFragment.newInstance())
//                .commitNow()
//        }
        Log.d(TAG, "onCreate() called with: savedInstanceState = $savedInstanceState")
        Log.d(TAG, "onCreate: intent = $intent")
        val car = intent.getSerializableExtra("car") as Car
        Log.d(TAG, "onCreate: car = " + car + ", .name = "
                + car.name + ", .id = " + car.id)
        Log.d(TAG, "onCreate: car = $car, .name = ${car.name} , id = ${car.id}")
    }
}