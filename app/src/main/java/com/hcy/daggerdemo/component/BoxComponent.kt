package com.hcy.daggerdemo.component

import com.hcy.daggerdemo.MainActivity
import com.hcy.daggerdemo.moudle.BoxMoudle
import dagger.Component

@Component(modules = [BoxMoudle::class])
interface BoxComponent {
    fun inJect(activity: MainActivity);
}
