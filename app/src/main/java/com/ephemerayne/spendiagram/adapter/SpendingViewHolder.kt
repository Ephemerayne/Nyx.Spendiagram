package com.ephemerayne.spendiagram.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ephemerayne.spendiagram.databinding.SpendingItemBinding
import com.ephemerayne.spendiagram.domain.entity.Spending
import com.ephemerayne.spendiagram.utils.dateFormatter
import org.threeten.bp.LocalDate

class SpendingViewHolder(private val binding: SpendingItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

        private var spendingId: Int? = null

    fun setItemContent(spending: Spending, spendings: ArrayList<Spending>, position: Int) {
        spendingId = spending.id

        val date = binding.spendingDate
        val category = binding.spendingCategory
        val description = binding.spendingDescription
        val sum = binding.spendingSum
        val cardView = binding.cardViewSpending

        if (position > 0) {
            val previousSpending: Spending = spendings[position - 1]
            val previousDate: LocalDate = previousSpending.dateTime.toLocalDate()
            val currentDate: LocalDate = spending.dateTime.toLocalDate()

            if (previousDate.compareTo(currentDate) == 0) {
                date.visibility = View.GONE
            } else {
                date.visibility = View.VISIBLE
            }
        }

        if (position == 0) date.visibility = View.VISIBLE

        val dateString: String = dateFormatter.format(spending.dateTime)

        category.text = spending.category.title
        description.text = spending.description
        date.text = dateString
        sum.text = spending.sum.toString()

    }



}