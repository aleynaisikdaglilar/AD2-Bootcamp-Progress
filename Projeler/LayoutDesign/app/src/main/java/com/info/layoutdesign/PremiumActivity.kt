package com.info.layoutdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.info.layoutdesign.databinding.ActivityPremiumBinding

class PremiumActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPremiumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_premium)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_premium)
        binding.button2.setOnClickListener {
            val intent = Intent(this@PremiumActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}