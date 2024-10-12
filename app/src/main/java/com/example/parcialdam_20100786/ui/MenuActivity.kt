package com.example.parcialdam_20100786.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.parcialdam_20100786.R
import com.example.parcialdam_20100786.ui.fragments.HotelesFragment
import com.example.parcialdam_20100786.ui.fragments.PresupuestoFragment
import com.example.parcialdam_20100786.ui.fragments.SegurosFragment

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        findViewById<Button>(R.id.PresupuestoButton).setOnClickListener {
            startActivity(Intent(this, PresupuestoFragment::class.java))
        }

        findViewById<Button>(R.id.SegurosButton).setOnClickListener {
            startActivity(Intent(this, SegurosFragment::class.java))
        }

        findViewById<Button>(R.id.HotelesButton).setOnClickListener {
            startActivity(Intent(this, HotelesFragment::class.java))
        }
    }
}