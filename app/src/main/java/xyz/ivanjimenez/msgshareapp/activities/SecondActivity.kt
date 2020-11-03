package xyz.ivanjimenez.msgshareapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle = intent.extras
        val msg = bundle!!.getString("userMessage")

        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

        txtvUserMessage.text = msg
    }
}