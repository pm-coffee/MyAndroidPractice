package com.github.pmcoffee.myandroidpractice.model.item

import android.graphics.drawable.Drawable
import java.util.UUID

class ViewPager2Item (val image1Drawable: Drawable, val image1Caption:String,
					  val image2Drawable: Drawable, val image2Caption:String,
					  val image3Drawable: Drawable, val image3Caption:String,
					  val image4Drawable: Drawable, val image4Caption:String){
	
	val uniqueId:String = UUID.randomUUID().toString()
	
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is ViewPager2Item) return false
		
		if (image1Drawable != other.image1Drawable) return false
		if (image1Caption != other.image1Caption) return false
		if (image2Drawable != other.image2Drawable) return false
		if (image2Caption != other.image2Caption) return false
		if (image3Drawable != other.image3Drawable) return false
		if (image3Caption != other.image3Caption) return false
		if (image4Drawable != other.image4Drawable) return false
		if (image4Caption != other.image4Caption) return false
		
		return true
	}
	
	override fun hashCode(): Int {
		var result = image1Drawable.hashCode()
		result = 31 * result + image1Caption.hashCode()
		result = 31 * result + image2Drawable.hashCode()
		result = 31 * result + image2Caption.hashCode()
		result = 31 * result + image3Drawable.hashCode()
		result = 31 * result + image3Caption.hashCode()
		result = 31 * result + image4Drawable.hashCode()
		result = 31 * result + image4Caption.hashCode()
		return result
	}
}
