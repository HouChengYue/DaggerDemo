package com.hcy.daggerdemo.component;

import com.hcy.daggerdemo.AActivity;
import com.hcy.daggerdemo.MainActivity;
import com.hcy.daggerdemo.moudle.AMoudle;
import com.hcy.daggerdemo.moudle.GsonMoudle;
import dagger.Module;
import dagger.Subcomponent;

/**
 * @author YC-HCY
 * @date 17:24 description：
 */
@Subcomponent(modules = {AMoudle.class, GsonMoudle.class})
public interface MainComponent {
  void inject(MainActivity mainActivity);
}
