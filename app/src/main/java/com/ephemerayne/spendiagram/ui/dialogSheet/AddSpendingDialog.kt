package com.ephemerayne.spendiagram.ui.dialogSheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.ephemerayne.spendiagram.R
import com.ephemerayne.spendiagram.databinding.AddSpendingDialogBinding


class AddSpendingDialog : DialogFragment(R.layout.add_spending_dialog) {

    lateinit var viewModel: AddSpendingDialogViewModel

    private lateinit var binding: AddSpendingDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = AddSpendingDialogBinding.inflate(inflater).also { binding = it }.root
}

