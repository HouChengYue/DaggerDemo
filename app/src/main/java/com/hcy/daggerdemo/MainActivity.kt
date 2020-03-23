package com.hcy.daggerdemo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.hcy.daggerdemo.bean.A
import com.hcy.daggerdemo.bean.User
import com.hcy.daggerdemo.component.DaggerAppComponent
import com.hcy.daggerdemo.qualifier.UserNamed


import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/*
* google 文档说明
*   @Component告诉Dagger实现interface或abstract class创建或返回一个或多个应用程序对象。
    Dagger将生成一个实现组件类型的类。生成的类型将被命名DaggerYourType（或 DaggerYourType_NestedType用于嵌套类型）
    @Inject构造函数上的内容告诉Dagger如何实例化该类。我们很快会看到更多。
    @Inject构造函数的参数是该类的依赖项。Dagger将提供类的依赖关系以实例化类本身。请注意，这是递归的：依赖项可能具有自己的依赖项！
    @Modules是充当Dagger关于如何构造依赖项的指令的集合的类或接口。之所以称为模块是因为它们是模块化的：您可以在不同的应用程序和上下文中混合和匹配模块。
    @Binds方法是告诉Dagger如何构造实例的一种方法。它们是模块上的抽象方法，这些方法将Dagger已经知道如何构造的一种类型（方法的参数）与Dagger尚未知道如何构造的类型（方法的返回类型）相关联。
    @Provides方法是模块中的具体方法，该模块告诉Dagger，当某些对象请求该类型的实例返回时，该方法应调用该方法以获取实例。像@Inject 构造函数一样，它们可以具有参数：这些参数是它们的依赖项。
    @Provides方法可以包含任意代码，只要它们返回提供的类型的实例即可。他们不需要在每次调用时创建一个新实例。
    @IntoMap允许创建具有特定类型值的MAP，并使用特殊注释（例如@StringKey或）设置键 @IntKey。由于键是通过注释设置的，因此Dagger确保不会将多个值映射到同一键。
    @IntoSet允许创建一组要收集在一起的类型。它可以与@Binds和@Provides 方法一起使用以提供Set<ReturnType>。
    @IntoMap并且@IntoSet是引入什么通常被称为“multibindings”，其中集合包含从几个不同的装订方式元素的两种方式。
    @Singleton指示Dagger为组件的每个实例创建该类型的一个实例。它可以在具有@Inject构造函数的类型的类声明中使用，也可以在 @Bindsor @Provides方法上使用。
    尚不清楚为什么还必须使用该组件注释 @Singleton，但是稍后将变得更加清楚。
    带@Subcomponent注释的类型（“子组件”）与带注释的类型一样 @Component，是对象的工厂。像一样 @Component，它使用模块来提供Dagger实现指令。子组件始终具有父组件（或父子组件），并且在父级中可请求的任何对象在子级中都是可请求的，反之亦然。
    带@Subcomponent.Factory注释的类型创建子组件的实例。它的一个实例在父组件中是可请求的。
    有一个@Component.Factory用于 的并行注释@Component。
    @BindsInstance 参数使您可以使组件中的其他绑定方法请求任意对象。
    @Qualifier 注释用于区分不相关的相同类型的实例。
    将其与@IntoSet和相比@IntoMap，将收集的对象一起使用。
    限定符经常但不总是与常见的数据类型一起使用，例如原始类型和String，由于不同的原因它们可能在程序的许多地方使用。
    甲@Scope指示匕首注释为所有用于该类型（子）组件，其共享相同的注释的一个实例内的请求提供一个共享的实例。
    请注意@Singleton，我们之前描述的，实际上只是另一个范围注释！
    作用域实例的生存期与具有该作用域的组件的生存期直接相关。
    注意，作用域的名称是没有意义的。@Singleton如果在单个JVM中实例化了多个@Singleton-annotated，那么甚至可以创建-annotated类型的多个 @Component实例。
    当Dagger创建对象的集合或映射时，该集合或映射将包含任何上级组件的值，以及通过绑定本身在组件中安装的值。
    @BindsOptionalOf告诉Dagger它可以构造的实例 Optional<ReturnType>。的存在Optional取决于Dagger是否知道如何创建的实例ReturnType，并且它可以存在于子组件中，但不存在于其父组件中。


*
* */
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
    @UserNamed("one")
    @Inject
    lateinit var a:A
    @UserNamed("two")
    @Inject
    lateinit var b:A
    @Inject
    lateinit var gosn:Gson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = User()
        user.name = "张三"
        user.avatar = "password"
        MApplication.get(this).creatUserComponent(user)
        DaggerAppComponent.builder().build().plus().inject(this)
        btn1.setOnClickListener {
            a.filed="测试内容"
            val toJson = gosn.toJson(a)
            Log.e("TAG", "onCreate: $toJson")
            a.doSomeThing()
            val tob = gosn.toJson(b)
            Log.e("TAG", "onCreate: $tob")
        }

        btn2.setOnClickListener {
            startActivity(Intent(this,AActivity::class.java))
        }

    }


    fun showMainWay() {
        Toast.makeText(this, "MainActivity 的方法", Toast.LENGTH_SHORT).show()
    }
}
