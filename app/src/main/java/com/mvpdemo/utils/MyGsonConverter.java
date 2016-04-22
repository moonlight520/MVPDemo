package com.mvpdemo.utils;

import com.google.gson.Gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/**
 * Created by moon on 2016/4/22.
 */
public class MyGsonConverter extends Converter.Factory  {
    public static MyGsonConverter create() {
        return create(new Gson());
    }

    public static MyGsonConverter create(Gson gson) {
        return new MyGsonConverter(gson);
    }

    private final Gson gson;

    private MyGsonConverter(Gson gson) {
        if (gson == null) throw new NullPointerException("gson == null");
        this.gson = gson;
    }


    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        return new GsonRequestBodyConverter<>(gson,type);
    }
      /*  @Override
    public Converter<ResponseBody, ?> fromResponseBody(Type type, Annotation[] annotations) {
        return new GsonResponseBodyConverter<>(gson, type);
    }

    @Override public Converter<?, RequestBody> toRequestBody(Type type, Annotation[] annotations) {
        return new GsonRequestBodyConverter<>(gson, type);
    }*/
}
