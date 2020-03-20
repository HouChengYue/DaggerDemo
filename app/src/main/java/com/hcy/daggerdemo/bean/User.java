package com.hcy.daggerdemo.bean;

import javax.inject.Inject;

/**
 * @author YC-HCY
 * @date 14:48 description：
 */
public class User {

  /**
   * 用户名
   */
  private String name;
  /**
   * 头像
   */
  private String avatar;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }
  @Inject
  public User() {
  }
}
