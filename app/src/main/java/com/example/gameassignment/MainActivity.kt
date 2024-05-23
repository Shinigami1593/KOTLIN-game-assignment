package com.example.gameassignment

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gameassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var homeBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        homeBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(homeBinding.root)

        homeBinding.AdditionButton.setOnClickListener {
            var intent=Intent(this@MainActivity,AdditionActivity::class.java)
            var operation:String="add"
            intent.putExtra("operator",operation)

            startActivity(intent)
            finish()
        }
        homeBinding.SubtractionButton.setOnClickListener {
            var intent=Intent(this@MainActivity,AdditionActivity::class.java)
            var operation:String="sub"
            intent.putExtra("operator",operation)

            startActivity(intent)
            finish()
        }
        homeBinding.MultiplicationButton.setOnClickListener {
            var intent= Intent(this@MainActivity,AdditionActivity::class.java)
            var operation:String="mul"
            intent.putExtra("operator",operation)

            startActivity(intent)
            finish()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}