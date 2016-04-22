package com.mvpdemo.presenter;

import android.os.Handler;
import android.util.Log;

import com.mvpdemo.bean.UserInfo;
import com.mvpdemo.biz.OnLoginListener;
import com.mvpdemo.biz.UserBiz;
import com.mvpdemo.view.IUserLoginView;

/**
 * Created by moon on 2016/4/20.
 */
public class UserPresenter {
    private UserBiz userBiz;
    private IUserLoginView userLoginView;
    private Handler mHandler = new Handler();

    public UserPresenter(IUserLoginView userLoginView) {
        this.userBiz = new UserBiz();
        this.userLoginView = userLoginView;

    }
    public void login(){

        userBiz.login("001","111111", new OnLoginListener(){

            @Override
            public void loginSuccess(final UserInfo userInfo) {
                Log.e("userLoginView","user"+userLoginView.getUserName());
                //需要在UI线程执行
                mHandler.post(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Log.e("---","正在login");
                        userLoginView.toMainActivity(userInfo);


                    }
                });

            }

            @Override
            public void loginFaild() {
                //需要在UI线程执行
                mHandler.post(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        userLoginView.showFailedError();
                        Log.e("---","login_faild");

                    }
                });
            }
        });
    }

}

