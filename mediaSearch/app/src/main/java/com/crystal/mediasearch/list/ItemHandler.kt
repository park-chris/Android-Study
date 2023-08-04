package com.crystal.mediasearch.list

import com.crystal.mediasearch.model.ListItem

interface ItemHandler {
    fun onClickFavorite(item: ListItem)
}