package com.ephemerayne.spendiagram.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import com.ephemerayne.spendiagram.App
import com.ephemerayne.spendiagram.databinding.ActivityMainBinding
import com.ephemerayne.spendiagram.domain.main.MainActivityViewModel
import com.ephemerayne.spendiagram.ui.adapter.SpendingAdapter
import com.ephemerayne.spendiagram.ui.dialogSheet.AddSpendingDialog
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var activityViewModel: MainActivityViewModel

    private lateinit var binding: ActivityMainBinding

    private val adapter: SpendingAdapter = SpendingAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as App).appComponent.inject(this)

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

        activityViewModel.testLiveData.observe(this@MainActivity) {
            adapter.setSpendings(spendings = it)

        }
    }
}