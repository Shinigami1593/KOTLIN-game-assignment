package com.example.gameassignment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gameassignment.databinding.ActivityGameOverBinding

class GameOver : AppCompatActivity() {
    lateinit var GameOver: ActivityGameOverBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        GameOver=ActivityGameOverBinding.inflate(layoutInflater)
        setContentView(GameOver.root)
        var sc:String=intent.getStringExtra("Score").toString()
        Log.d("message",sc)

//        var Score = sc.toIntOrNull() ?: 0;
        GameOver.textView5.text=("Your score was "+ sc);

        GameOver.PlayAgain.setOnClickListener {
            var intent= Intent(this@GameOver, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        GameOver.Exit.setOnClickListener {
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}