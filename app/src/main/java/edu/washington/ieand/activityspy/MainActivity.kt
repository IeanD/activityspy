package edu.washington.ieand.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(javaClass.name, "onCreate fired")
        if (savedInstanceState != null) {
            Log.i(javaClass.name, savedInstanceState.toString())
        }
    }

    override fun onStart() {
        super.onStart()

        Log.i(javaClass.name, "onStart fired")
    }

    override fun onResume() {
        super.onResume()

        Log.i(javaClass.name, "onResume fired")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i(javaClass.name, "onRestart fired")
    }

    override fun onPause() {
        super.onPause()

        Log.i(javaClass.name, "onPause fired")

    }

    override fun onStop() {
        super.onStop()

        Log.i(javaClass.name, "onStop fired")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.e(javaClass.name, "We're going down, captain!")
    }
}
