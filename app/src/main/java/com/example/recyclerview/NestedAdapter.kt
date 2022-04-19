package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NestedAdapter(
	val mList: List<String>
) : RecyclerView.Adapter<NestedAdapter.NestedViewHolder>() {

	class NestedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
		val text = itemView.findViewById<TextView>(R.id.nested_text)
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NestedViewHolder {
		val view = LayoutInflater.from(parent.context).inflate(R.layout.single_grade, parent, false)
		return NestedViewHolder(view)
	}

	override fun onBindViewHolder(holder: NestedViewHolder, position: Int) {
		holder.text.text = mList[position]
	}

	override fun getItemCount(): Int {
		return  mList.size
	}
}