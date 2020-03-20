package com.hcy.daggerdemo.component;

import com.hcy.daggerdemo.moudle.AppMoudle;
import com.hcy.daggerdemo.moudle.UserModule;
import dagger.Component;
import dagger.Subcomponent;
import javax.inject.Singleton;

/**
 * @author YC-HCY
 * @date 14:55 description：
 * 5.新建一个全局的父Component，引用子Component。
 */
@Singleton
@Component(modules = AppMoudle.class)
public interface AppComponent {
  UserComponent plus(UserModule userModule);
  MainComponent plus();
}
