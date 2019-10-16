package com.hcy.daggerdemo

import android.app.Application


/**
 * @author YC-HCY
 * @date 2019/10/16
 * 自定义Application
 */
class MApplication : Application() {
//    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
//        return
//    }

    override fun onCreate() {
        super.onCreate()

    }

//    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
////     return   DaggerCookAppComponent.builder().create(this);
//
//    }


}
