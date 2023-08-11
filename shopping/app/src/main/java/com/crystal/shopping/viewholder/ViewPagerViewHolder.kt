package com.crystal.shopping.viewholder

import com.crystal.shopping.ListAdapter
import com.crystal.shopping.databinding.ItemViewpagerBinding
import com.crystal.shopping.model.ListItem
import com.crystal.shopping.model.ViewPager

class ViewPagerViewHolder(
    binding: ItemViewpagerBinding
): BindingViewHolder<ItemViewpagerBinding>(binding) {

    private val adapter = ListAdapter()

    init {
        binding.viewpager.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as ViewPager
        adapter.submitList(item.items)
    }

}