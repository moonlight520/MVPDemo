package com.mvpdemo.biz;

import android.util.Log;

import com.mvpdemo.bean.UserInfo;

import okhttp3.HttpUrl;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by moon on 2016/4/20.
 */
public class UserBiz implements IUserBiz {

    @Override
    public void login(final String username, String password,final OnLoginListener loginListener) {
        LoginService loginService=RetrofitWrapper.getInstance().create(LoginService.class);
        Call<UserInfo> call=loginService.getBaseInfo(username,password);
        call.enqueue(new Callback<UserInfo>() {
            @Override
            public void onResponse(Call<UserInfo> call, Response<UserInfo> response) {
                {
                    boolean responseSuccessful= response.isSuccessful();
                    Log.e("login",responseSuccessful+"------------"+response);
                    UserInfo info=response.body();
                    if(info.getUsername().equals("001")){
                        loginListener.loginSuccess(info);
                    }else{
                        loginListener.loginFaild();
                    }
                }
            }

            @Override
            public void onFailure(Call<UserInfo> call, Throwable t) {



                    Log.e("login",call.isExecuted()+"----onFailure--------"+t.toString());

            }
        });
        boolean isExecuted=call.isExecuted();
        Request request=call.request();
        HttpUrl url=request.url();
        Log.e("url",url.toString());
        Log.e("isExecuted",isExecuted+"--"+ request.body().toString());

    }

}
