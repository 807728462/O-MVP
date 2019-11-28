package com.oyf.basemvp;

/**
 * @创建者 oyf
 * @创建时间 2019/11/28 14:18
 * @描述
 **/
public class CommonContract {
    public interface CommonModel {
        void sendVerificationCode(String phone);
    }

    public interface CommonPresenter {
        void sendVerificationCode(String phone);

        void response(String result);
    }
}
