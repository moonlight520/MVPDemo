package com.mvpdemo.biz;

import android.content.Context;

import com.mvpdemo.Contants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by moon on 2016/4/20.
 */
public class RetrofitWrapper {
    private static RetrofitWrapper instance;
    private Context mContext;
    private Retrofit retrofit;

    private RetrofitWrapper() {

        retrofit=new Retrofit.Builder().baseUrl(Contants.BASE_URL).
                addConverterFactory(GsonConverterFactory.create()).build();


    }
    public static RetrofitWrapper getInstance(){
         if(instance==null){
             synchronized (RetrofitWrapper.class){
                 instance=new RetrofitWrapper();
             }
         }
        return instance;
    }
    public <T> T create(Class<T> service){
        return retrofit.create(service);
    }

}
