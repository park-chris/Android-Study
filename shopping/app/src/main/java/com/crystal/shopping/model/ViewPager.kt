package com.crystal.shopping.model

data class ViewPager(
    val items : List<ListItem>
): ListItem {
    override val viewType: ViewType
        get() = ViewType.VIEW_PAGER

}
