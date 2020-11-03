package xyz.ivanjimenez.msgshareapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import xyz.ivanjimenez.msgshareapp.Constants
import xyz.ivanjimenez.msgshareapp.R
import xyz.ivanjimenez.msgshareapp.showToast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        bundle?.let {
            val msg = bundle.getString(Constants.USER_MSG_KEY)
            msg?.let { str -> showToast(message = str) }
            txtvUserMessage.text = msg
        }
    }
}
