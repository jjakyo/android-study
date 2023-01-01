package com.example.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.list.databinding.ActivityRecyclerviewBinding

class RecyclerViewActivity : AppCompatActivity() {

    lateinit var binding: ActivityRecyclerviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}