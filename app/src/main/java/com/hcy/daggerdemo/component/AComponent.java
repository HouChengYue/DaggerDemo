package com.hcy.daggerdemo.component;

import android.app.Activity;
import android.content.Context;
import com.hcy.daggerdemo.AActivity;
import com.hcy.daggerdemo.MainActivity;
import com.hcy.daggerdemo.moudle.AMoudle;
import com.hcy.daggerdemo.moudle.GsonMoudle;
import dagger.Component;
import dagger.Subcomponent;

/**
 * @author YC-HCY
 * @date 13:52 description：
 */
@Subcomponent(modules = {AMoudle.class, GsonMoudle.class})
public interface AComponent {
     void inject(AActivity aActivity);
}
