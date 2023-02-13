package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.DataResource
import com.example.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val dataset = DataResource().loadAffirmations()
        binding.recyclerView.apply {
            adapter = ItemAdapter(this@MainActivity, dataset)
            setHasFixedSize(true)
        }
    }
}