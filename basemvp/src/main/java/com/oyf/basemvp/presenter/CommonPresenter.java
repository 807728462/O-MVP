package com.oyf.basemvp.presenter;

import com.oyf.basemvp.CommonContract;
import com.oyf.basemvp.model.CommonModel;
import com.oyf.basemvp.view.BaseView;

/**
 * @创建者 oyf
 * @创建时间 2019/11/28 14:16
 * @描述
 **/
public abstract class CommonPresenter< M extends CommonModel,V extends BaseView, CONTRACT extends CommonContract.CommonPresenter> extends BasePresenter<M, V, CONTRACT> implements CommonContract.CommonPresenter {


    public CommonPresenter(V v) {
        super(v);
    }

    @Override
    public void sendVerificationCode(String phone) {
        mModel.sendVerificationCode(phone);
    }

    @Override
    public void response(String result) {
        //在这里回调给view  也可以在子类回调给view  这样就可以不用限制view，如果需要公共接口的话   presenter 跟model  就好了  ，其实也可以只要model配置成公共的
    }
}
