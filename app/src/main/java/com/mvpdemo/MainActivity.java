package com.mvpdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mvpdemo.bean.UserInfo;
import com.mvpdemo.databinding.ActivityMainBinding;
import com.mvpdemo.presenter.UserPresenter;
import com.mvpdemo.view.IUserLoginView;

public class MainActivity extends AppCompatActivity implements IUserLoginView, View.OnClickListener {
    private Button login_btn;
    private UserPresenter mUserPresenter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setUserinfo(new UserInfo("用户名：","密码："));

        login_btn= (Button) findViewById(R.id.login);
        login_btn.setOnClickListener(this);

    }

    @Override
    public String getUserName() {
        EditText et= (EditText) findViewById(R.id.et_name);
        return et.getText().toString();
    }

    @Override
    public String getPassword() {
        EditText et1= (EditText) findViewById(R.id.et_pass);
        return et1.getText().toString();
    }

    @Override
    public String getDbCode() {
        return "588";
    }

    @Override
    public void clearUserName() {

    }

    @Override
    public void clearPassword() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {


    }

    @Override
    public void toMainActivity(UserInfo user) {
        Intent intent=new Intent(this,SecondActivity.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("userinfobean",user);
        intent.putExtra("user_bundle",bundle);
        this.startActivity(intent);
    }

    @Override
    public void showFailedError() {

    }

    @Override
    public void onClick(View v) {
        Log.e("onClick","点击登录");
        mUserPresenter = new UserPresenter(this);
        mUserPresenter.login();

    }
}
