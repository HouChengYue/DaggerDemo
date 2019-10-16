package com.hcy.daggerdemo.bean


import java.lang.StringBuilder
import javax.inject.Inject

/**
 * @author YC-HCY
 * @date 2019/10/16
 *   厨师 可以 做饭
 */
class Chef :Cooking {
    /**
     * 菜单
     */
    lateinit var menu: Menu
    @Inject
    constructor(menu: Menu) {
        this.menu = menu
    }


    override fun cook(): String {
        var meanList:Map<String,Boolean> = menu.getMenus()
        val sb = StringBuilder()
        for (entry in meanList) {
            if (entry.value){
                sb.append(entry.key).append(",")
            }
        }
        return sb.toString()
    }
}
