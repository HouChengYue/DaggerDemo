package com.hcy.daggerdemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.hcy.daggerdemo.bean.Box
import com.hcy.daggerdemo.component.DaggerBoxComponent
import com.hcy.daggerdemo.moudle.BoxMoudle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 * Dagger2
 * https://blog.csdn.net/riqthen/article/details/80585703
 */
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var box:Box

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerBoxComponent.builder().boxMoudle(BoxMoudle()).build().inJect(this)
        btn1.setOnClickListener {
            box.description()
        }
    }


    fun showMainWay() {
        Toast.makeText(this, "MainActivity 的方法", Toast.LENGTH_SHORT).show()
    }
}
