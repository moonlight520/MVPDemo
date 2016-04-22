package com.mvpdemo.biz;

import com.mvpdemo.bean.UserInfo;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by moon on 2016/4/20.
 */
public interface LoginService {
    @POST("test/test")
    Call<UserInfo> getBaseInfo(@Query("username")String username,
                                @Query("password")String password);
}
