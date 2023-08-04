package com.crystal.mediasearch.list.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.crystal.mediasearch.databinding.ItemImageBinding
import com.crystal.mediasearch.list.ItemHandler
import com.crystal.mediasearch.model.ImageItem
import com.crystal.mediasearch.model.ListItem

class ImageViewHolder(
    private val binding: ItemImageBinding,
    private val itemHandler: ItemHandler? = null
): RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ListItem) {
        item as ImageItem
        binding.item = item
        binding.handler = itemHandler
    }

}