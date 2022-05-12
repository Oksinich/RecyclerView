package com.example.recyclerview

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.RequiresApi
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
            TitleViewHolder(view)
        } else {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.single_grade, parent, false)
            DescViewHolder(view)
        }

    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model: RecyclerViewItem = gradesList[position]

        if (holder is TitleViewHolder && model is RecyclerViewItem.Title) {
            holder.grade.text = model.title
            holder.image.setImageDrawable(model.image)
            holder.criteriass.setOnClickListener {
                model.isExpanded = !model.isExpanded
                /**
                 * Если грейд свернули, то из [gradesList] удаляю критерии грейда, чтоб они не отображались
                 */
                if (!model.isExpanded) {
                    model.criteriASS.forEach { modelDesc ->
                        gradesList.removeIf {
                            it == modelDesc
                        }
                        notifyDataSetChanged()
                    }
                } else {
                    /**
                     * Если грейд развернули, то
                     * если это не единственный грейд и не последний, то сохраняю всё что ниже
                     * в "кэш" [subGradesList] и удаляю из [gradesList]
                     * Потом добавляю в [gradesList] критерии грейда и всё что шло ниже ([subGradesList])
                     *
                     */
                    if (gradesList.size > 1 && position != gradesList.size - 1) {
                        val subGradesList = ArrayList<RecyclerViewItem>(
                            gradesList.subList(
                                position + 1,
                                gradesList.size
                            )
                        )
                        gradesList.removeIf {
                            subGradesList.contains(it)
                        }
                        model.criteriASS.forEach {
                            gradesList.add(it)
                        }

                        subGradesList.forEach {
                            gradesList.add(it)
                        }

                        notifyDataSetChanged()
                    } else {
                        /**
                         * Если единственный или последний грейд, то просто добавляю в [gradesList] его критерии
                         */
                        gradesList.addAll(model.criteriASS)
                        notifyDataSetChanged()

                    }
                }
            }
        }

        if (holder is DescViewHolder && model is RecyclerViewItem.Desc) {
            holder.desc.text = model.desc
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