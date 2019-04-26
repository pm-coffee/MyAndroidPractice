package com.github.pmcoffee.myandroidpractice.contents.viewpager2androom.withfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.github.pmcoffee.myandroidpractice.R
import com.github.pmcoffee.myandroidpractice.databinding.ListItemViewpager2WithFragmentBinding
import timber.log.Timber

class PagerFragment: Fragment(R.layout.list_item_viewpager2_with_fragment) {

    lateinit var binding: ListItemViewpager2WithFragmentBinding

    lateinit var viewModel:PagerViewModel


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)!!

        binding = DataBindingUtil.bind(view)!!
        val key = arguments?.getString("key")
        Timber.d("onCreateView() key = $key viewModel = $viewModel")

        binding.itemDataList = viewModel.viewDataList

        return binding.root
    }


    companion object {
        fun create(key: String) =
            PagerFragment().apply {
                arguments = Bundle(1).apply {
                    putSerializable("key", key)
                }
            }
    }
}