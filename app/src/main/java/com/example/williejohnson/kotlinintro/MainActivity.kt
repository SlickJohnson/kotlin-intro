package com.example.williejohnson.kotlinintro

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {
        // Get the value of the text view.
        val countString = textView.text.toString()

        // Convert value to a number and increment.
        var count: Int = Integer.parseInt(countString)
        count++

        // Display the new value in the text view.
        textView.text = count.toString()
    }

    fun randomMe(view: View) {
        // Create intent to start second activity.
        val randomIntent = Intent(this, SecondActivity::class.java)

        // Grab value of textview.
        val countString = textView.text.toString()

        // Convert to int and send to intent.
        val count: Int = Integer.parseInt(countString)

        // Send data to intent.
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        // Start the new activity.
        startActivity(randomIntent)
    }
}
