package com.example.recyclerview

import android.graphics.drawable.Drawable

class DataModel(
	var nestedList: List<String>,
	var itemText: String,
	var image: Drawable,
	var isExpanded: Boolean = false
)