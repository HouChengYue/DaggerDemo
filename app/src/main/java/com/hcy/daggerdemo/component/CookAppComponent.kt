package com.hcy.daggerdemo.component

import com.hcy.daggerdemo.MApplication
import com.hcy.daggerdemo.moudle.ActivityModule
import com.hcy.daggerdemo.moudle.CookMoudles
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * @author YC-HCY
 * @date 2019/10/16
 *
 */
@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityModule::class,
    CookMoudles::class
])
interface CookAppComponent : AndroidInjector<MApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MApplication>()

}
