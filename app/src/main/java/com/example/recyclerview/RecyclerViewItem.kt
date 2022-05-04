package com.example.recyclerview

import android.graphics.drawable.Drawable

open class RecyclerViewItem {
    data class Title(var title: String, var image: Drawable, var isExpanded: Boolean = false ) : RecyclerViewItem()
    data class Desc(var desc: String) : RecyclerViewItem()
}