package com.hcy.daggerdemo.moudle;

import com.google.gson.Gson;
import dagger.Module;
import dagger.Provides;

/**
 * @author YC-HCY
 * @date 14:33 description：获取Gson 的Moudle
 */
@Module
public class GsonMoudle {

  @Provides
  public Gson providesGson(){
    return new Gson();
  }

}
