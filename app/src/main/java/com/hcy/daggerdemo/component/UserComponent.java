package com.hcy.daggerdemo.component;

import com.hcy.daggerdemo.moudle.AMoudle;
import com.hcy.daggerdemo.moudle.BMoudle;
import com.hcy.daggerdemo.moudle.UserModule;
import com.hcy.daggerdemo.scope.UserScope;
import dagger.Component;
import dagger.Subcomponent;

/**
 * @author YC-HCY
 * @date 14:52 description：
 *  Subcomponent注解与Component依赖另一个Component有点像，他们区别在于：
 * Subcomponent可以获取到父Component的所有可以产生出的对象。
 */
@UserScope
@Subcomponent(modules = UserModule.class)
public interface UserComponent {
  AComponent plus(AMoudle aMoudle);
  BComponent plus(BMoudle aMoudle);
}
