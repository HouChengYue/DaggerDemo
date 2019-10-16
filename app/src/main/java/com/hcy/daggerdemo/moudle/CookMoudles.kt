package com.hcy.daggerdemo.moudle

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author YC-HCY
 * @date 2019/10/16
 * Moudle 生成菜单
 */
@Module
class CookMoudles {
    @Singleton
    @Provides
    fun provideMeus(): Map<String, Boolean> {
        val means = linkedMapOf<String, Boolean>()
        means["酸菜鱼"] = true
        means["土豆丝"] = true
        means["铁板牛肉"] = true
        return means
    }
}
