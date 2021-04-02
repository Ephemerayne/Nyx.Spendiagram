package com.ephemerayne.spendiagram.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ephemerayne.spendiagram.adapter.SpendingAdapter
import com.ephemerayne.spendiagram.databinding.ActivityMainBinding
import com.ephemerayne.spendiagram.domain.main.MainActivityViewModel
import com.ephemerayne.spendiagram.ui.dialogSheet.AddSpendingDialog

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

        binding.buttonAddSpendingDialog.setOnClickListener {
            val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            val addSpendingDialog: DialogFragment = AddSpendingDialog()
            addSpendingDialog.show(fragmentTransaction, "ADD")
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