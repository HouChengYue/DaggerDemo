package com.hcy.daggerdemo.moudle;

import com.hcy.daggerdemo.bean.A;
import com.hcy.daggerdemo.qualifier.UserNamed;
import dagger.Module;
import dagger.Provides;

/**
 * @author YC-HCY
 * @date 14:04 description：
 */
@Module
public class AMoudle {
  @UserNamed("one")
  @Provides
  public A provideA(){
    return new A();
  }

  @UserNamed("two")
  @Provides
  public A provideSec(){
    A a = new A();
    a.setFiled("123456");
    return a;
  }




}
