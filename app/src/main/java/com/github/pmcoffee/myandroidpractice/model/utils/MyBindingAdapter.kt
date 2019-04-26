package com.github.pmcoffee.myandroidpractice.model.utils

import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter



object MyBindingAdapter {
    @BindingAdapter("android:src")
    @JvmStatic
    fun setImageViewResource(imageView: ImageView, @DrawableRes resource: Int) {
        imageView.setImageResource(resource)
    }
}
