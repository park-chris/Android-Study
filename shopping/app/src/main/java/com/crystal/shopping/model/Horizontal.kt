package com.crystal.shopping.model

data class Horizontal(
    val title: String,
    val items: List<ListItem>
): ListItem {
    override val viewType: ViewType
        get() = ViewType.HORIZONTAL

}
