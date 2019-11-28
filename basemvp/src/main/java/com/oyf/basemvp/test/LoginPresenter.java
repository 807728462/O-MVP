package com.oyf.basemvp.test;

import com.oyf.basemvp.presenter.CommonPresenter;

/**
 * @创建者 oyf
 * @创建时间 2019/11/28 11:49
 * @描述
 **/
public class LoginPresenter extends CommonPresenter<LoginModel, LoginActivity, LoginContract.LoginPresenter> implements LoginContract.LoginPresenter {


    public LoginPresenter(LoginActivity loginActivity) {
        super(loginActivity);
    }

    @Override
    public LoginContract.LoginPresenter getContract() {
        return this;
    }

    @Override
    public LoginModel creatModel() {
        return new LoginModel(this);
    }

    @Override
    public void executeLogin(String name, String pwd) {
        //在此处可以自己处理或者交给model处理
        try {
            mModel.executeLogin(name, pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void responseLogin(int resultCode, String data) {
        getView().responseLogin(resultCode, data);
    }

    @Override
    public void response(String result) {
        super.response(result);
        getView().responseLogin(200, result);
    }
}
