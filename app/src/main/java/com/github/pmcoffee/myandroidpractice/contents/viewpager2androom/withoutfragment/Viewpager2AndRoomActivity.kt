package com.github.pmcoffee.myandroidpractice.contents.viewpager2androom.withoutfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.github.pmcoffee.myandroidpractice.MyApp
import com.github.pmcoffee.myandroidpractice.R
import com.github.pmcoffee.myandroidpractice.databinding.ActivityViewpager2AndRoomBinding

class Viewpager2AndRoomActivity : AppCompatActivity() {
	
	private val binding: ActivityViewpager2AndRoomBinding by lazy {
		DataBindingUtil.setContentView<ActivityViewpager2AndRoomBinding>(this, R.layout.activity_viewpager2_and_room)
	}
	
	private val viewModel: ViewPager2AndRoomViewModel by lazy {
		ViewModelProvider.AndroidViewModelFactory.getInstance(MyApp.instance!!).create(ViewPager2AndRoomViewModel::class.java)
	}
	
	private val adapter = ViewPager2Adapter()
	
	
	//region setup methods
	private fun setup(){
		setupBinding()
		setupViewPager2()
	}

	private fun setupViewPager2() {
		binding.viewpager2.adapter = adapter
		
		viewModel.viewPager2ItemListLive.observe(this, Observer {
			adapter.submitList(it)
		})
	}

	private fun setupBinding(){
		binding.lifecycleOwner = this
		binding.viewModel = viewModel
	}
	
	//endregion setup methods
	
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setup()
	}
}
