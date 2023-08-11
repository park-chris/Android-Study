package com.crystal.shopping.viewholder

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.crystal.shopping.BR
import com.crystal.shopping.model.ListItem

abstract class BindingViewHolder<VB: ViewDataBinding>(
    private val binding: VB
): RecyclerView.ViewHolder(binding.root) {

    protected var item : ListItem? = null

    open fun bind(item: ListItem) {
        this.item = item
        binding.setVariable(BR.item, this.item)
    }

}