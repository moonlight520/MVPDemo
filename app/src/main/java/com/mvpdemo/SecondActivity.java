package com.mvpdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mvpdemo.bean.UserInfo;
import com.mvpdemo.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra("user_bundle");
        UserInfo bean= (UserInfo) intent.getSerializableExtra("userinfobean");
        ActivitySecondBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_second);
        binding.setBean(bean);
    }
}
