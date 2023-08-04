package com.crystal.mediasearch.list.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.crystal.mediasearch.databinding.ItemVideoBinding
import com.crystal.mediasearch.list.ItemHandler
import com.crystal.mediasearch.model.ListItem
import com.crystal.mediasearch.model.VideoItem

class VideoViewHolder(
    private val binding: ItemVideoBinding,
    // 핸들러가 필요없는 곳에는 null 처리를 위해
    private val itemHandler: ItemHandler? = null
): RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ListItem) {
        item as VideoItem
        binding.item = item
        binding.handler = itemHandler
    }
}