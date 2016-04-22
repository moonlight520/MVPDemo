package com.mvpdemo.biz;

import com.mvpdemo.bean.UserInfo;

/**
 * Created by moon on 2016/4/20.
 */
public interface OnLoginListener {
    void loginSuccess(UserInfo userInfo);
    void loginFaild();
}
