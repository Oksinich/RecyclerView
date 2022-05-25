package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(
    var gradesList: MutableList<RecyclerViewItem>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val LAYOUT_TITLE = 0
    private val LAYOUT_DESC = 1

    class TitleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val grade: TextView = itemView.findViewById(R.id.text)
        var image: ImageView = itemView.findViewById(R.id.image)
        val criteriass: LinearLayout = itemView.findViewById(R.id.linear)
    }

    class DescViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val desc: TextView = itemView.findViewById(R.id.nested_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == LAYOUT_TITLE) {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.parent_recycler, parent, false)
            val viewHolder = TitleViewHolder(view)
            viewHolder.criteriass.setOnClickListener {
                val item = getItem(viewHolder.adapterPosition)
                onItemClick(viewHolder.adapterPosition, item as RecyclerViewItem.Title)
            }
            return viewHolder
        } else {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.single_grade, parent, false)
            DescViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model: RecyclerViewItem = gradesList[position]

        if (holder is TitleViewHolder && model is RecyclerViewItem.Title) {
            holder.grade.text = model.title
            holder.image.setImageDrawable(model.image)
        }
        if (holder is DescViewHolder && model is RecyclerViewItem.Desc) {
            holder.desc.text = model.desc
        }
    }

    private fun getItem(adapterPos: Int): RecyclerViewItem {
        return gradesList[adapterPos]
    }

    private fun onItemClick(position: Int, model: RecyclerViewItem.Title) {
        model.isExpanded = !model.isExpanded
        /**
         * Если грейд свернули, то из [gradesList] удаляю критерии грейда, чтоб они не отображались
         */
        if (!model.isExpanded) {
            gradesList.subList(position + 1, model.criteriASS.size + position + 1).clear()
            notifyItemRangeRemoved(position + 1, model.criteriASS.size)
            notifyItemRangeChanged(position + 1, itemCount)
        } else {
            /**
             * Если грейд развернули, то добавляем его критерии
             */
            gradesList.addAll(position + 1, model.criteriASS)
            notifyItemRangeInserted(position + 1, model.criteriASS.size)
            notifyItemRangeChanged(position + 1, itemCount)
        }
    }

    override fun getItemCount(): Int {
        return gradesList.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (gradesList[position] is RecyclerViewItem.Desc) {
            LAYOUT_DESC
        } else {
            LAYOUT_TITLE
        }
    }
}