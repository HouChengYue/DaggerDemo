package com.hcy.daggerdemo.moudle;

import com.hcy.daggerdemo.bean.User;
import com.hcy.daggerdemo.scope.UserScope;
import dagger.Module;
import dagger.Provides;

/**
 * @author YC-HCY
 * @date 14:49 description：用户Moudle
 */
@Module
public class UserModule {
  private User user;

  public UserModule(User user) {
    this.user = user;
  }
  @Provides
  @UserScope
  User provideUser(){
    return user;
  }
}
