package com.oyf.basemvp.test;

import com.oyf.basemvp.CommonContract;

/**
 * @创建者 oyf
 * @创建时间 2019/11/28 11:41
 * @描述
 **/
public class LoginContract {

    interface Loginmodel extends CommonContract.CommonModel {
        // Model层子类完成方法的具体实现
        void executeLogin(String name, String pwd) throws Exception;
    }

    interface LoginPresenter extends CommonContract.CommonPresenter {
        //提供登录给view去调用
        void executeLogin(String name, String pwd);

        //提供响应结果给model去调用
        void responseLogin(int resultCode, String data);
    }

    interface LoginView {
        //处理登录返回结果
        void responseLogin(int resultCode, String data);
    }
}
