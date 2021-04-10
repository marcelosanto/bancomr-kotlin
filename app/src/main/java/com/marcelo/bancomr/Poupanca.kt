package com.marcelo.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marcelo.bancomr.databinding.ActivityFaturasBinding
import com.marcelo.bancomr.databinding.ActivityPoupancaBinding

class Poupanca : AppCompatActivity() {
    private lateinit var binding: ActivityPoupancaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPoupancaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar!!.hide()

        val toolbar = binding.toolbarPoupanca
        toolbar.title = "Poupança"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(400,0,400,0)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}