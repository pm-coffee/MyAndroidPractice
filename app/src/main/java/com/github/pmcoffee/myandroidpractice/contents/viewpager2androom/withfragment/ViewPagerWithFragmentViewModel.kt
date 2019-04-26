package com.github.pmcoffee.myandroidpractice.contents.viewpager2androom.withfragment

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.github.pmcoffee.myandroidpractice.R

class ViewPagerWithFragmentViewModel(application: Application): AndroidViewModel(application) {


	val keyList = ArrayList<String>().apply {
		add("jis")
		add("code")
		add("とかでも")
		add("いけるのかな?")

	}

	companion object {
		val IMAGE_CAPTION_MAP: HashMap<String, Int> by lazy {
			val map = HashMap<String, @androidx.annotation.DrawableRes Int>()

			map["水を吐くフグのイラスト"] = R.drawable.fish_fugu_haku
			map["ノートパソコンに向かってニヤけるハッカー"] = R.drawable.hacker_cracker1_smile
			map["女子卓球のイラスト（対戦相手付き）"] = R.drawable.sports_takkyu_women
			map["スターゲイジーパイのイラスト"] = R.drawable.food_stargazy_pie
			map["ボクシングの試合のイラスト"] = R.drawable.boxing_punch

			map["ノーカラーコートのイラスト"] = R.drawable.fashion_nocollar_coat
			map["髪がボサボサの人のイラスト（男性）"] = R.drawable.hair_biyou_bosabosa_man
			map["アレッサンドロ・ボルタの似顔絵イラスト"] = R.drawable.nigaoe_alessan_aolta
			map["海ぶどうのイラスト"] = R.drawable.food_umibudou
			map["強制労働のイラスト"] = R.drawable.dorei_kyousei_roudou

			map["羊を数えながら寝ている人のイラスト"] = R.drawable.sleep_sheep
			map["ビニール傘のイラスト（開いた状態）"] = R.drawable.rain_kasa_vinyl_open
			map["美味しそうにご飯を食べるおばさんのイラスト"] = R.drawable.oishii7_obasan
			map["香水を使う人のイラスト（女性）"] = R.drawable.kousui_woman
			map["吸入器のイラスト"] = R.drawable.sick_kyuuinki

			map["ドライブのイラスト「赤い車」"] = R.drawable.driving_red

			return@lazy map
		}

	}


	init {
	}
}
