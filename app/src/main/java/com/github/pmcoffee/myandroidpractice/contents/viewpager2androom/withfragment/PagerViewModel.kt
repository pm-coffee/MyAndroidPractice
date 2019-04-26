package com.github.pmcoffee.myandroidpractice.contents.viewpager2androom.withfragment

import androidx.annotation.DrawableRes
import androidx.lifecycle.ViewModel
import java.io.Serializable
import kotlin.random.Random

class PagerViewModel: ViewModel(), Serializable {

    data class ViewData(@DrawableRes val imageRes:Int, val title:String)

    val viewDataList = ArrayList<ViewData>(5)


    init{

        val dataList = ViewPagerWithFragmentViewModel.IMAGE_CAPTION_MAP.toList()

        while(viewDataList.size < 5) {
            val data = dataList[Random.nextInt(0, 15)]
            viewDataList.add(ViewData(data.second, data.first))
        }
    }
}