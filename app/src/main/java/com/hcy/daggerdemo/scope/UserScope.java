package com.hcy.daggerdemo.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Scope;

/**
 * @author YC-HCY
 * @date 14:45 description：
 *
 * Scope 用来划分作用域的
 *比如限制对象只能在所有Activity中使用，或者只能在Application中使用，或者只能在Fragment中使用
 * Singleton 单例模式全局共用一个对象 就是@Scope的一个实现。
 * 这里设置的是用户作用域
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface UserScope {

}
