package com.hcy.daggerdemo.moudle;

import com.hcy.daggerdemo.bean.A;
import dagger.Module;
import dagger.Provides;

/**
 * @author YC-HCY
 * @date 14:04 description：
 */
@Module
public class AMoudle {
  @Provides
  public A provideA(){
    return new A();
  }

}
