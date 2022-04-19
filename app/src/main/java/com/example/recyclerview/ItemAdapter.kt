package com.example.recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.Px
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(
	val mList: List<DataModel>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

	class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		val grade = itemView.findViewById<TextView>(R.id.text)
		val expandLayout = itemView.findViewById<LinearLayout>(R.id.criteria)
		var image = itemView.findViewById<ImageView>(R.id.image)
		val linear = itemView.findViewById<LinearLayout>(R.id.linear)
	}

	// чтоб один рекуклер и один адаптер

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
		val view = LayoutInflater.from(parent.context).inflate(R.layout.parent_recycler, parent, false)
		return ItemViewHolder(view)
	}

	override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
		val model: DataModel = mList[position]
		holder.grade.text = model.itemText
		holder.image.setImageDrawable(model.image)
		val isExpandable = model.isExpanded
		holder.expandLayout.visibility = if (isExpandable) View.VISIBLE else View.GONE

		holder.expandLayout.removeAllViewsInLayout()
		model.nestedList.forEach {
			addTextView(holder, it)
		}
		holder.linear.setOnClickListener {
			model.isExpanded = !model.isExpanded
			notifyItemChanged(holder.adapterPosition)
		}
	}

	override fun getItemCount(): Int {
		return mList.size
	}

	override fun getItemViewType(position: Int): Int {
		return super.getItemViewType(position)
	}

	private fun addTextView(holder: ItemViewHolder, text: String) {
		val textView = TextView(holder.linear.context)
		textView.textSize = 20f
		val layoutParams = LinearLayout.LayoutParams(
			LinearLayout.LayoutParams.MATCH_PARENT,
			LinearLayout.LayoutParams.WRAP_CONTENT
		)
		layoutParams.leftMargin = (60 * holder.linear.context.resources.displayMetrics.scaledDensity).toInt()
		layoutParams.topMargin = (5 * holder.linear.context.resources.displayMetrics.scaledDensity).toInt()
		layoutParams.bottomMargin = (5 * holder.linear.context.resources.displayMetrics.scaledDensity).toInt()
		textView.text = text
		holder.expandLayout.addView(textView, layoutParams)
	}
}