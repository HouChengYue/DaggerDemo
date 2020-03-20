package com.hcy.daggerdemo.moudle;

import android.app.Application;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * @author YC-HCY
 * @date 14:56 description：
 */
@Module
public class AppMoudle {
  private Application application;

  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }
  @Provides
  @Singleton
  public Application provideApplication(){
    return application;
  }

  public AppMoudle(Application application) {
    this.application = application;
  }
}
