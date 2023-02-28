package com.example.mvvmtrial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvmtrial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mbiniding : ActivityMainBinding
    private val model : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbiniding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        mbiniding.lifecycleOwner = this
        mbiniding.viewModel = model

        mbiniding.setMaxNumbtn.setOnClickListener{
            var intent = Intent(this, SetMaxActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}