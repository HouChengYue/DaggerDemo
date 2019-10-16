package com.hcy.daggerdemo.bean

import android.util.Log
import javax.inject.Inject

/**
 *
 * YC-HCY 2019/10/16
 */
class Box {
    @Inject constructor()

    constructor(name: String) {
        this.name = name
    }

    var name=""

    fun  description(){
        Log.e("TAG","Box:description:9---------->这是一个箱子！")
    }


}
