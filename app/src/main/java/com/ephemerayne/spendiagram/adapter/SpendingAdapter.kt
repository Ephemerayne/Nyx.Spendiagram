package com.ephemerayne.spendiagram.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ephemerayne.spendiagram.databinding.SpendingItemBinding
import com.ephemerayne.spendiagram.domain.entity.Spending

class SpendingAdapter : RecyclerView.Adapter<SpendingViewHolder>() {

    private val spendings: ArrayList<Spending> = ArrayList()

    fun setSpendings(spendings: List<Spending>) {
        this.spendings.apply {
            clear()
            addAll(spendings)
            sortBy { spending -> spending.dateTime }
            notifyDataSetChanged()
        }
    }

    fun getSpendings(): List<Spending> {
        return spendings
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpendingViewHolder {
        val binding = SpendingItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SpendingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SpendingViewHolder, position: Int) {
        val spending: Spending = spendings[position]
        holder.setItemContent(spending, spendings, position)
    }

    override fun getItemCount(): Int {
        return spendings.size
    }

}