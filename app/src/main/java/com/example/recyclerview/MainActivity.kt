package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

	private lateinit var recyclerView: RecyclerView
	private lateinit var mList:  List<DataModel>
	private lateinit var adapter: ItemAdapter

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		recyclerView = findViewById(R.id.rv_parent)
		recyclerView.setHasFixedSize(true)
		recyclerView.layoutManager = LinearLayoutManager(this)
		mList = GradeDataFactory.getParents(this.resources)

		adapter = ItemAdapter(mList)
		val dividerItemDecoration = DividerItemDecoration(recyclerView.context, LinearLayoutManager.VERTICAL)
		recyclerView.addItemDecoration(dividerItemDecoration)
		recyclerView.adapter = adapter
	}
}