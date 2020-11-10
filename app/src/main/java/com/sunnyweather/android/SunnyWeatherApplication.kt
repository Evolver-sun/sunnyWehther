package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * 获取全局Context
 */
class SunnyWeatherApplication : Application() {

    companion object{

        //设置全局上下文
        @SuppressLint("StaticFieldLeak")
        lateinit var context:Context

        //设置彩云天气令牌值
        const val TOKEN = "xnzHysOZviVWqK9G"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}