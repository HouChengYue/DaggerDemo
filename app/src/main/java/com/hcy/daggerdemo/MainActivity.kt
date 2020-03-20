package com.hcy.daggerdemo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.hcy.daggerdemo.bean.A
import com.hcy.daggerdemo.bean.User


import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 * Dagger2
 * https://blog.csdn.net/riqthen/article/details/80585703
 *
 * 假设需要做一个餐饮系统，需要把点好的菜单发给厨师，让厨师负责做菜。现在我们来尝试下用Dagger2来实现这个需求。
 * https://www.cnblogs.com/tangpj/p/9874133.html
 *
 *
 *2020 03 20 Demo
 * https://www.jianshu.com/p/269c3f70ec1e
 *
 *
 */
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var a:A
    @Inject
    lateinit var gosn:Gson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn1.setOnClickListener {
            a.filed="测试内容"
            val toJson = gosn.toJson(a)
            Log.e("TAG", "onCreate: $toJson")
            a.doSomeThing()
        }

        btn2.setOnClickListener {
            val user = User()
            user.name="张三"
            user.avatar="password"
            MApplication.get(this).creatUserComponent(user);
            startActivity(Intent(this,AActivity::class.java))
        }

    }


    fun showMainWay() {
        Toast.makeText(this, "MainActivity 的方法", Toast.LENGTH_SHORT).show()
    }
}
