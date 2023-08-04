package com.crystal.mediasearch

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import coil.load
import java.text.SimpleDateFormat
import java.util.Date


@BindingAdapter("visible")
fun View.setVisible(isShow: Boolean) {
    isVisible = isShow
}

@BindingAdapter("image")
fun ImageView.setImage(imageUrl: String?) {
    load(imageUrl) {
        crossfade(300)
    }
}

@BindingAdapter("date")
fun TextView.setDateText(date: Date?) {
    if (date == null) {
        return
    }

    text = SimpleDateFormat("YYYY.MM.dd HH:mm:ss").format(date)
}

@BindingAdapter("favorite")
fun ImageView.setFavorite(isFavorite: Boolean) {
    setImageResource(if (isFavorite) R.drawable.round_favorite_24 else R.drawable.round_favorite_border_24)
}