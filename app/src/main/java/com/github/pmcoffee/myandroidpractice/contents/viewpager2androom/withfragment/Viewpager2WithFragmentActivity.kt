package com.github.pmcoffee.myandroidpractice.contents.viewpager2androom.withfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.github.pmcoffee.myandroidpractice.MyApp
import com.github.pmcoffee.myandroidpractice.R
import com.github.pmcoffee.myandroidpractice.databinding.ActivityViewpager2WithFragmentBinding

class Viewpager2WithFragmentActivity : AppCompatActivity() {
	
	private val binding: ActivityViewpager2WithFragmentBinding by lazy {
		DataBindingUtil.setContentView<ActivityViewpager2WithFragmentBinding>(this, R.layout.activity_viewpager2_with_fragment).apply {
			viewModel = viewModel
			lifecycleOwner = this@Viewpager2WithFragmentActivity
		}
	}
	
	private val viewModel: ViewPagerWithFragmentViewModel by lazy {
		ViewModelProvider.AndroidViewModelFactory.getInstance(MyApp.instance!!).create(ViewPagerWithFragmentViewModel::class.java)
	}
	
	private val adapter = object: FragmentStateAdapter(this){

		override fun getItem(position: Int): Fragment {
			return PagerFragment.create(viewModel.keyList[position]).apply {
				this.viewModel = ViewModelProviders.of(this@Viewpager2WithFragmentActivity).get("$position", PagerViewModel::class.java)
			}
		}

		override fun getItemCount(): Int {
			return viewModel.keyList.size
		}

	}
	
	
	//region setup methods
	private fun setup(){
		binding.viewpager2.adapter = adapter
	}
	//endregion setup methods
	
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setup()
	}
}