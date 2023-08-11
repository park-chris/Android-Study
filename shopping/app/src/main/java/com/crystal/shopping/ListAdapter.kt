package com.crystal.shopping

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.crystal.shopping.model.ListItem
import com.crystal.shopping.viewholder.BindingViewHolder
import com.crystal.shopping.viewholder.ViewHolderGenerator

class ListAdapter: ListAdapter<ListItem, BindingViewHolder<*>>(DiffCallback()) {

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        return item?.viewType?.ordinal ?: -1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder<*> {
        return ViewHolderGenerator.get(parent, viewType)
    }

    override fun onBindViewHolder(holder: BindingViewHolder<*>, position: Int) {
        val item = getItem(position)
        if (item != null) {
            holder.bind(item)
        }
    }

}