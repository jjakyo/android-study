package com.example.list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.example.list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = mutableListOf<String>()
        items.add("아이템1")
        items.add("아이템2")
        items.add("아이템3")

        val adapter = ListViewAdapter(items)
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            when(position) {
                0 -> startActivity(Intent(this, RecyclerViewActivity::class.java))
                1 -> Toast.makeText(this, "2번쨰 아이템 클릭", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "3번쨰 아이템 클릭", Toast.LENGTH_SHORT).show()
            }
        }
    }
}