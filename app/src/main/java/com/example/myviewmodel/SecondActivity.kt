package com.example.myviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.myviewmodel.R.color.white
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
        val car = intent.getSerializableExtra("car") as DiscoveredCar
        Log.d(TAG, "onCreate: car = " + car + ", .name = "
                + car.name + ", .id = " + car.id)
        Log.d(TAG, "onCreate: car = $car, .name = ${car.name} , id = ${car.id}")

        /* XMLではなく、コードでTextView・ImageViewを下方に追加 */
        val layout = findViewById<LinearLayout>(R.id.container)
        val textView = TextView(applicationContext)
        textView.text = "hogehoge"
        textView.setTextColor(resources.getColor(white))
        layout.addView(textView)

        val imageView = ImageView(applicationContext)
        imageView.setImageResource(R.drawable.ic_launcher_foreground)
//        imageView.foregroundGravity = Gravity.END
        layout.addView(imageView)
    }
}