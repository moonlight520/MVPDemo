package com.mvpdemo.view;

import com.mvpdemo.bean.UserInfo;

/**
 * Created by moon on 2016/4/20.
 */
public interface IUserLoginView {
    String getUserName();

    String getPassword();
    String getDbCode();

    void clearUserName();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity(UserInfo info);

    void showFailedError();
}
