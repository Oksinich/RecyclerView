package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(
	val mList: List<RecyclerViewItem>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

	private val LAYOUT_TITLE = 0
	private val LAYOUT_DESC = 1

	class TitleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		val grade = itemView.findViewById<TextView>(R.id.text)
		var image = itemView.findViewById<ImageView>(R.id.image)
	}

	class DescViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		val desc = itemView.findViewById<TextView>(R.id.nested_text)
	}

	// чтоб один рекуклер и один адаптер

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
		return if (viewType == LAYOUT_TITLE) {
			val view = LayoutInflater.from(parent.context).inflate(R.layout.parent_recycler, parent, false)
			TitleViewHolder(view)
		} else {
			val view = LayoutInflater.from(parent.context).inflate(R.layout.single_grade, parent, false)
			DescViewHolder(view)
		}

	}

	override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
		val model: RecyclerViewItem = mList[position]
		if (holder is TitleViewHolder && model is RecyclerViewItem.Title) {
			holder.grade.text = model.title
			holder.image.setImageDrawable(model.image)
		}


		if (holder is DescViewHolder && model is RecyclerViewItem.Desc) {
			holder.desc.text = model.desc
		}
	}

	override fun getItemCount(): Int {
		return mList.size
	}

	override fun getItemViewType(position: Int): Int {
		return if (mList[position] is RecyclerViewItem.Title) {
			LAYOUT_TITLE
		} else {
			LAYOUT_DESC
		}
	}
}