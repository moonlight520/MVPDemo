package com.mvpdemo.biz;

import android.content.Intent;
import android.view.View;

import com.mvpdemo.SecondActivity;

/**
 * Created by moon on 2016/4/20.
 */
public class EventHanlders {
    public void loginEvent(View view){
        Intent intent=new Intent(view.getContext(), SecondActivity.class);
        view.getContext().startActivity(intent);
    }
    public void clearEvent(View view){

    }
}
