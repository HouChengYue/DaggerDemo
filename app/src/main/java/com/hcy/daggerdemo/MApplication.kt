package com.hcy.daggerdemo

import android.app.Application
import android.content.Context
import com.hcy.daggerdemo.bean.User
import com.hcy.daggerdemo.component.AppComponent
import com.hcy.daggerdemo.component.DaggerAppComponent
import com.hcy.daggerdemo.component.UserComponent
import com.hcy.daggerdemo.moudle.AppMoudle
import com.hcy.daggerdemo.moudle.UserModule


/**
 * @author YC-HCY
 * @date 2019/10/16
 * 自定义Application
 */
public class MApplication : Application() {
    /**
     * application 组件
     */
    private lateinit var appComponent: AppComponent

    /**
     * 用户组件
     */
      var userComponent: UserComponent?=null

    companion object {
        fun get(context: Context): MApplication {
            return context.applicationContext as MApplication
        }
    }


    override fun onCreate() {
        super.onCreate()
//        appComponent=DaggerAppComponent.builder().appMoudle(AppMoudle(this@MApplication)).build()
        appComponent=DaggerAppComponent.builder().build()
    }

    /**
     *注入UserComponent，调用此方法后，UserCope生效
     */
    public fun creatUserComponent(user:User):UserComponent?{
        userComponent=appComponent.plus(UserModule(user))
        return userComponent
    }

    /**
     * 释放UserComponent组件
     */
    public fun releaseUserComponent(){
        userComponent=null;
    }


}
