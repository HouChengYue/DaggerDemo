package com.hcy.daggerdemo.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;

/**
 * @author YC-HCY
 * @date 17:12 description：Qualifier Named
 * https://www.jianshu.com/p/269c3f70ec1e
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface UserNamed {
  String value() default "";
}
