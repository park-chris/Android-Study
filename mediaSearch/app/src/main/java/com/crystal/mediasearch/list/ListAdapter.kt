package com.crystal.mediasearch.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.crystal.mediasearch.databinding.ItemImageBinding
import com.crystal.mediasearch.databinding.ItemVideoBinding
import com.crystal.mediasearch.list.viewholder.ImageViewHolder
import com.crystal.mediasearch.list.viewholder.VideoViewHolder
import com.crystal.mediasearch.model.ImageItem
import com.crystal.mediasearch.model.ListItem

class ListAdapter(
    private val itemHandler: ItemHandler? = null
): ListAdapter<ListItem, RecyclerView.ViewHolder>(diffUtil) {

    override fun getItemViewType(position: Int): Int {
        return if (getItem(position) is ImageItem) {
            IMAGE
        } else {
            VIDEO
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return if (viewType == IMAGE) {
            ImageViewHolder(ItemImageBinding.inflate(inflater, parent, false), itemHandler)
        } else {
            VideoViewHolder(ItemVideoBinding.inflate(inflater, parent, false), itemHandler)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        if (getItemViewType(position) == IMAGE) {
            (holder as ImageViewHolder).bind(item)
        } else {
            (holder as VideoViewHolder).bind(item)
        }
    }


    companion object {

        private const val IMAGE = 0
        private const val VIDEO = 1

        private val diffUtil = object : DiffUtil.ItemCallback<ListItem>() {
            override fun areItemsTheSame(oldItem: ListItem, newItem: ListItem) = oldItem.thumbnailUrl == newItem.thumbnailUrl

            override fun areContentsTheSame(oldItem: ListItem, newItem: ListItem) = oldItem == newItem

        }
    }


}