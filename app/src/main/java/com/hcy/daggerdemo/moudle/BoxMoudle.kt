package com.hcy.daggerdemo.moudle

import com.hcy.daggerdemo.bean.Box
import dagger.Component
import dagger.Module
import dagger.Provides

/**
 *
 * YC-HCY 2019/10/16
 */
@Module
class BoxMoudle {
    @Provides
    fun getBox(): Box {
        return  Box("Moudle")
    }
}
