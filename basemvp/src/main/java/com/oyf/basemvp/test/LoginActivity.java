package com.oyf.basemvp.test;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.oyf.basemvp.R;
import com.oyf.basemvp.view.BaseView;


/**
 * @创建者 oyf
 * @创建时间 2019/11/28 11:37
 * @描述
 **/
public class LoginActivity extends BaseView<LoginPresenter, LoginContract.LoginView> implements LoginContract.LoginView {


    @Override
    protected int getLayoutId() {
        return R.layout.layout_login;
    }

    @Override
    protected LoginContract.LoginView getContract() {
        return this;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        Button bt = findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mPresenter.getContract().executeLogin("name", "123");
                mPresenter.getContract().sendVerificationCode("123");
            }
        });
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }

    @Override
    protected LoginPresenter creatPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    public void responseLogin(int resultCode, String data) {
        showToast(data);
    }
}
