package com.example.bitrisesample

import android.app.Activity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.bitrisesample.databinding.ActivitySimpleBinding

class SimpleActivity: Activity() {

    private val test = BuildConfig.test
    private lateinit var binding: ActivitySimpleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple)
        binding.info = test.test()
    }
}