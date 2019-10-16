package com.hcy.daggerdemo.moudle

import com.hcy.daggerdemo.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @author YC-HCY
 * @date 2019/10/16
 * 活动Module
 */
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}
