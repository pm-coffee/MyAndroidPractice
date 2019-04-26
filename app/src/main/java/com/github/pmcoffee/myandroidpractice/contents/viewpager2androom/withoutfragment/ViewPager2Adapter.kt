package com.github.pmcoffee.myandroidpractice.contents.viewpager2androom.withoutfragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.github.pmcoffee.myandroidpractice.R
import com.github.pmcoffee.myandroidpractice.databinding.ListItemViewpager2Binding
import com.github.pmcoffee.myandroidpractice.model.item.ViewPager2Item

class ViewPager2Adapter : ListAdapter<ViewPager2Item, ViewPager2Adapter.ItemViewHolder>(
	DIFF_CALL_BACK
) {
	
	companion object {
		val DIFF_CALL_BACK = object : DiffUtil.ItemCallback<ViewPager2Item>() {
			override fun areItemsTheSame(oldItem: ViewPager2Item, newItem: ViewPager2Item): Boolean {
				return oldItem == newItem
			}
			
			override fun areContentsTheSame(oldItem: ViewPager2Item, newItem: ViewPager2Item): Boolean {
				return oldItem.uniqueId == newItem.uniqueId
			}
			
		}
	}
	
	class ItemViewHolder(val itemBinding: ListItemViewpager2Binding) : RecyclerView.ViewHolder(itemBinding.root)
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
		return ItemViewHolder(
			DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.list_item_viewpager2, parent, false)
		)
	}
	
	override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
		holder.itemBinding.itemData = getItem(position)
	}
	
	
}