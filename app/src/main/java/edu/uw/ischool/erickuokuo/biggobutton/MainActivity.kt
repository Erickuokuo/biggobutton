package edu.uw.ischool.erickuokuo.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pushButton: Button = findViewById(R.id.pushButton)

        pushButton.setOnClickListener(View.OnClickListener {
            clickCount++
            val buttonText = "You have pushed me $clickCount time" + if (clickCount == 1) "" else "s"
            pushButton.text = buttonText
        })
    }
}