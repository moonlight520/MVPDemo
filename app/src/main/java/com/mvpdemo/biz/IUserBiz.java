package com.mvpdemo.biz;

/**
 * Created by moon on 2016/4/20.
 */
public interface IUserBiz {
    public void login(String username,String password,OnLoginListener loginListener);
}
