package br.com.rsoftware.businesscard.ui

import android.view.View
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.rsoftware.businesscard.data.BusinessCard
import br.com.rsoftware.businesscard.databinding.ItemBusinessCardBinding

class BusinessCardAdapter :
    ListAdapter<BusinessCard, BusinessCardAdapter.ViewHolder>(DiffCallback()) {
    var listenerShare: (View) -> Unit = {}

    inner class ViewHolder(
        private val binding: ItemBusinessCardBinding
    ) : RecyclerView.ViewHolder(binding.root) {

    }
}