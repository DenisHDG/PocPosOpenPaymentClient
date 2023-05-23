package com.example.pos_open_payment_client

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ClientActivity : AppCompatActivity() {

    private lateinit var btnNOK: Button
    private lateinit var btnOK: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnNOK = findViewById(R.id.btnNOK)
        btnOK = findViewById(R.id.btnOK)

        btnOK.setOnClickListener {
            val intent = Intent()
            intent.putExtra("result", "Compra finalizada com sucesso!")
            setResult(200, intent)
            super.onBackPressed()
        }
        btnNOK.setOnClickListener {
            val intent = Intent()
            intent.putExtra("result", "Compra Recusada, refaça a operação !")
            setResult(400, intent)
            super.onBackPressed()
        }
    }
}