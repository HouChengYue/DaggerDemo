package com.hcy.daggerdemo.bean;

import android.util.Log;
import javax.inject.Inject;

/**
 * @author YC-HCY
 * @date 13:51 description：
 */
public class A {
private String filed;

  public String getFiled() {
    return filed;
  }

  public void setFiled(String filed) {
    this.filed = filed;
  }
  @Inject
  public A() {
  }
  public void doSomeThing(){
    Log.e("TAG", "doSomeThing: " );
  }
}
