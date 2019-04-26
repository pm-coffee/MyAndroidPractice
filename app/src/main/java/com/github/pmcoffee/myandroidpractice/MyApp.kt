package com.github.pmcoffee.myandroidpractice

import android.app.Application
import android.util.Log
import timber.log.Timber

class MyApp: Application() {

	companion object {
		var instance:MyApp? = null
	}


	override fun onCreate() {
		super.onCreate()

		if(instance == null){
			instance = this
		}

		Timber.plant(
			if (BuildConfig.DEBUG)
				Timber.DebugTree()
			else
				object : Timber.Tree() {
					override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
						when (priority) {
							Log.ERROR, Log.WARN -> {
//								Crashlytics.log(priority, tag ?: "tag is null", message)
								if (t != null) {
//									Crashlytics.logException(t)
								}
							}
						}
					}
				})

//		MyFirebaseManager.initialize(this)
	}
}
