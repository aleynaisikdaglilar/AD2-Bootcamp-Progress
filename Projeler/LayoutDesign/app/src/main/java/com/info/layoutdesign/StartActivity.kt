package com.info.layoutdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.info.layoutdesign.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding:ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_start)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_start)
        binding.button.setOnClickListener {
            val intent = Intent(this@StartActivity, PremiumActivity::class.java)
            startActivity(intent)
        }
    }
}