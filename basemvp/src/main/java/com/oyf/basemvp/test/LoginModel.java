package com.oyf.basemvp.test;

import com.oyf.basemvp.model.CommonModel;

/**
 * @创建者 oyf
 * @创建时间 2019/11/28 11:59
 * @描述
 **/
public class LoginModel extends CommonModel<LoginPresenter, LoginContract.Loginmodel> implements LoginContract.Loginmodel {

    public LoginModel(LoginPresenter mPresener) {
        super(mPresener);
    }

    @Override
    public LoginContract.Loginmodel getContract() {
        return this;
    }


    @Override
    public void executeLogin(String name, String pwd) throws Exception {
        if ("name".equals(name) && "123".equals(pwd)) {
            mPresener.getContract().responseLogin(200, "成功");
        } else {
            mPresener.getContract().responseLogin(404, "失败");
        }
    }
}
