package com.ephemerayne.spendiagram.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ephemerayne.spendiagram.adapter.SpendingAdapter
import com.ephemerayne.spendiagram.databinding.ActivityMainBinding
import com.ephemerayne.spendiagram.domain.main.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var activityViewModel: MainActivityViewModel

    private val adapter: SpendingAdapter = SpendingAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivityMainBinding.inflate(layoutInflater).also {
            binding = it
            setContentView(it.root)
        }

        binding.spendingRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.spendingRecyclerView.adapter = adapter

        activityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java).apply {
            testLiveData.observe(this@MainActivity) {
                adapter.setSpendings(spendings = it)
            }
        }
    }
}