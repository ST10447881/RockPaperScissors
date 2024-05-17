package rockpaperscissors.llc

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var Rockbutton: Button
    private lateinit var Paperbutton: Button
    private lateinit var Scissorsbutton:Button
    private lateinit var tv2:TextView


    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

       //Initializing
        imageView = findViewById(R.id.imageView)
        Rockbutton = findViewById(R.id.Rockbutton)
        Paperbutton = findViewById(R.id.Paperbutton)
        Scissorsbutton = findViewById(R.id.Scissorsbutton)
        tv2 = findViewById(R.id.tv2)


            Rockbutton.setOnClickListener {
                imageView.setImageResource(R.drawable.paper2)
                tv2.text ="Boo hoo you lost. Try Again"
            }

            Paperbutton.setOnClickListener {
                imageView.setImageResource(R.drawable.rock2)
                tv2.text ="You Win!, Finally."
            }


            Scissorsbutton.setOnClickListener {
                imageView.setImageResource(R.drawable.rock2)
                tv2.text = "You Lost,again :)"
            }

        }
    }
