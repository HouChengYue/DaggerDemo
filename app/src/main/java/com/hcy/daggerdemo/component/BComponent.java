package com.hcy.daggerdemo.component;

import com.hcy.daggerdemo.BActivity;
import com.hcy.daggerdemo.MainActivity;
import com.hcy.daggerdemo.moudle.BMoudle;
import com.hcy.daggerdemo.moudle.GsonMoudle;
import dagger.Component;
import dagger.Subcomponent;

/**
 * @author YC-HCY
 * @date 13:52 description：
 */
@Subcomponent(modules = {BMoudle.class, GsonMoudle.class})
public interface BComponent {
     void inject(BActivity bActivity);
}
