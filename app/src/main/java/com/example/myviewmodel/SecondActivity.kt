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
        Log.d(
            TAG, "onCreate: car = " + car + ", .name = "
                    + car.name + ", .id = " + car.id
        )
        Log.d(TAG, "onCreate: car = $car, .name = ${car.name} , id = ${car.id}")

        /* XMLではなく、コードでTextView・ImageViewを下方に追加 */
        //Androidでコードからviewを追加する - Qiita https://qiita.com/asukahime1021/items/8034341b55ebe4f7cc5c
        val layout = findViewById<LinearLayout>(R.id.container)
        val tv = TextView(applicationContext)
        tv.text = "hogehoge"
        tv.setTextColor(resources.getColor(white))
        layout.addView(tv)

        val imageView = ImageView(applicationContext)
        imageView.setImageResource(R.drawable.ic_launcher_foreground)
//        imageView.foregroundGravity = Gravity.END
        layout.addView(imageView)

        /* [Android] レイアウトファイルを使わないでコードでTextViewを作る
         https://akira-watson.com/android/textview-2.html */
        // LinearLayoutのインスタンス作成
        val linearLayout = LinearLayout(this)
        // LinearLayoutの特徴としてorientation(方向)を決る
        linearLayout.orientation = LinearLayout.VERTICAL
        // setContentViewに設定
//        setContentView(linearLayout)
        val textView = TextView(this)
        textView.text = "Test TextView"
        linearLayout.addView(textView)
        layout.addView(linearLayout)

    }
}