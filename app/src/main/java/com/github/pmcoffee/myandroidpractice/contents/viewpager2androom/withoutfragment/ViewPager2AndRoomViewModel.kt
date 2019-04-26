package com.github.pmcoffee.myandroidpractice.contents.viewpager2androom.withoutfragment

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.github.pmcoffee.myandroidpractice.R
import com.github.pmcoffee.myandroidpractice.model.item.ViewPager2Item
import kotlin.random.Random

class ViewPager2AndRoomViewModel(application: Application): AndroidViewModel(application) {
	
	val viewPager2ItemListLive: MutableLiveData<ArrayList<ViewPager2Item>> by lazy {
		return@lazy MutableLiveData<ArrayList<ViewPager2Item>>().apply { value = ArrayList() }
	}
	
	private val imageCaptionMap: HashMap<String, Drawable> by lazy {
		val map = HashMap<String, Drawable>()
		
		map["水を吐くフグのイラスト"] = application.getDrawable(R.drawable.fish_fugu_haku)!!
		map["ノートパソコンに向かってニヤけるハッカー"] = application.getDrawable(R.drawable.hacker_cracker1_smile)!!
		map["女子卓球のイラスト（対戦相手付き）"] = application.getDrawable(R.drawable.sports_takkyu_women)!!
		map["スターゲイジーパイのイラスト"] = application.getDrawable(R.drawable.food_stargazy_pie)!!
		map["ボクシングの試合のイラスト"] = application.getDrawable(R.drawable.boxing_punch)!!
		
		map["ノーカラーコートのイラスト"] = application.getDrawable(R.drawable.fashion_nocollar_coat)!!
		map["髪がボサボサの人のイラスト（男性）"] = application.getDrawable(R.drawable.hair_biyou_bosabosa_man)!!
		map["アレッサンドロ・ボルタの似顔絵イラスト"] = application.getDrawable(R.drawable.nigaoe_alessan_aolta)!!
		map["海ぶどうのイラスト"] = application.getDrawable(R.drawable.food_umibudou)!!
		map["強制労働のイラスト"] = application.getDrawable(R.drawable.dorei_kyousei_roudou)!!
		
		map["羊を数えながら寝ている人のイラスト"] = application.getDrawable(R.drawable.sleep_sheep)!!
		map["ビニール傘のイラスト（開いた状態）"] = application.getDrawable(R.drawable.rain_kasa_vinyl_open)!!
		map["美味しそうにご飯を食べるおばさんのイラスト"] = application.getDrawable(R.drawable.oishii7_obasan)!!
		map["香水を使う人のイラスト（女性）"] = application.getDrawable(R.drawable.kousui_woman)!!
		map["吸入器のイラスト"] = application.getDrawable(R.drawable.sick_kyuuinki)!!
		
		map["ドライブのイラスト「赤い車」"] = application.getDrawable(R.drawable.driving_red)!!
		
		return@lazy map
	}
	
	init {
		val dataList = imageCaptionMap.entries.toList()
		val list = ArrayList<ViewPager2Item>()
		
		while(list.size < 5) {
			
			val data1 = dataList[Random.nextInt(0, 15)]
			val data2 = dataList[Random.nextInt(0, 15)]
			val data3 = dataList[Random.nextInt(0, 15)]
			val data4 = dataList[Random.nextInt(0, 15)]
			
			list.add(
				ViewPager2Item(data1.value, data1.key,
					data2.value, data2.key,
					data3.value, data3.key,
					data4.value, data4.key)
			)
		}
		
		viewPager2ItemListLive.postValue(list)
	}
}
