package xyz.ivanjimenez.msgshareapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_hobbies.*
import xyz.ivanjimenez.msgshareapp.adapters.HobbiesAdapter
import xyz.ivanjimenez.msgshareapp.R
import xyz.ivanjimenez.msgshareapp.models.Supplier

class HobbiesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = HobbiesAdapter(context = this, hobbies = Supplier.hobbies)
        recyclerView.adapter = adapter
    }
}
