package com.marcelo.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marcelo.bancomr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.saldo.setOnClickListener {
            val intent = Intent(this, Saldo::class.java)
            startActivity(intent)
            finish()
        }
    }
}