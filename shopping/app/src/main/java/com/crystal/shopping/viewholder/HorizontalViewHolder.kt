package com.crystal.shopping.viewholder

import com.crystal.shopping.ListAdapter
import com.crystal.shopping.databinding.ItemHorizontalBinding
import com.crystal.shopping.model.Horizontal
import com.crystal.shopping.model.ListItem

class HorizontalViewHolder(
    private val binding: ItemHorizontalBinding
): BindingViewHolder<ItemHorizontalBinding>(binding) {
    private val adapter = ListAdapter()

    init {
        binding.listView.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as Horizontal
        binding.titleTextView.text = item.title
        adapter.submitList(item.items)
    }

}