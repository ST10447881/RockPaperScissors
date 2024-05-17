package rockpaperscissors.llc

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var tv1:TextView
    private lateinit var imgView:ImageView
    private lateinit var startButton:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tv1 = findViewById(R.id.tv1)
        imgView = findViewById(R.id.imgView)
        startButton = findViewById(R.id.startButton)

    startButton.setOnClickListener {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
        finish()
    }






        }
    }
