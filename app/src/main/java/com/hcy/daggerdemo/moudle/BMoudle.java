package com.hcy.daggerdemo.moudle;

import com.hcy.daggerdemo.bean.A;
import com.hcy.daggerdemo.bean.B;
import dagger.Module;
import dagger.Provides;

/**
 * @author YC-HCY
 * @date 14:04 description：
 */
@Module
public class BMoudle {
  @Provides
  public B provideA(){
    return new B();
  }

}
