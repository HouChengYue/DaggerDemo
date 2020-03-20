package com.hcy.daggerdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hcy.daggerdemo.bean.User
import com.hcy.daggerdemo.moudle.AMoudle
import com.hcy.daggerdemo.moudle.BMoudle
import kotlinx.android.synthetic.main.activity_other.*
import javax.inject.Inject

class BActivity : AppCompatActivity() {
    @Inject
    lateinit var user: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        MApplication.get(this).userComponent?.plus(BMoudle())?.inject(this);
        tvDisplay.text = "用户信息：用户名：${user.name} 密码${user.avatar}"
        btnToB.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java).putExtra("user",1))
        }

    }
}
