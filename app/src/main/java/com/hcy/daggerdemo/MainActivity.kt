package com.hcy.daggerdemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.hcy.daggerdemo.bean.Box
import com.hcy.daggerdemo.bean.Chef

import com.hcy.daggerdemo.moudle.BoxMoudle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 * Dagger2
 * https://blog.csdn.net/riqthen/article/details/80585703
 *
 * 假设需要做一个餐饮系统，需要把点好的菜单发给厨师，让厨师负责做菜。现在我们来尝试下用Dagger2来实现这个需求。
 * https://www.cnblogs.com/tangpj/p/9874133.html
 *
 */
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var box:Box
    @Inject
    lateinit var chef:Chef


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        DaggerBoxComponent.builder().boxMoudle(BoxMoudle()).build().inJect(this)
        btn1.setOnClickListener {
            box.description()
        }
    }


    fun showMainWay() {
        Toast.makeText(this, "MainActivity 的方法", Toast.LENGTH_SHORT).show()
    }
}
