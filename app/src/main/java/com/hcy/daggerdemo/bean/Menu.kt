package com.hcy.daggerdemo.bean

import javax.inject.Inject

/**
 * @author YC-HCY
 * @date 2019/10/16
 * 菜单 用于点菜等操作
 */
class Menu {
    var meanList:Map<String,Boolean> = mapOf()

    @Inject constructor(menus: Map<String, Boolean>) {
        this.meanList = meanList
    }


    /**
     * 获取菜单
     */
    fun getMenus(): Map<String, Boolean> {
        return  this.meanList
    }
}
