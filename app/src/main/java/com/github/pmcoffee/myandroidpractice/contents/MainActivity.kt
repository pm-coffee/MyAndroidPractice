package com.github.pmcoffee.myandroidpractice.contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.github.pmcoffee.myandroidpractice.R
import com.github.pmcoffee.myandroidpractice.contents.viewpager2androom.withfragment.Viewpager2WithFragmentActivity
import com.github.pmcoffee.myandroidpractice.contents.viewpager2androom.withoutfragment.Viewpager2AndRoomActivity
import com.github.pmcoffee.myandroidpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	
	private val binding: ActivityMainBinding by lazy {
		DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
	}
	
	private val viewModel:MainViewModel by lazy {
		ViewModelProviders.of(this).get(MainViewModel::class.java)
	}
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		binding.lifecycleOwner = this
		binding.viewModel = viewModel
		
		binding.viewpager2AndRoomButton.setOnClickListener{
			val intent = Intent(this, Viewpager2AndRoomActivity::class.java)
			startActivity(intent)
		}

		binding.viewpager2WithFragmentButton.setOnClickListener {
			val intent = Intent(this, Viewpager2WithFragmentActivity::class.java)
			startActivity(intent)
		}

//		val manager = SliceManager.getInstance(this)
//
//		manager.grantSlicePermission("com.google.android.googlequicksearchbox", this.grantUriPermission())
	}
}
