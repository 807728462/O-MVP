package com.oyf.basemvp.model;

import com.oyf.basemvp.CommonContract;
import com.oyf.basemvp.presenter.CommonPresenter;

/**
 * @创建者 oyf
 * @创建时间 2019/11/28 14:17
 * @描述
 **/
public abstract class CommonModel<P extends CommonPresenter, CONTRACT extends CommonContract.CommonModel> extends BaseModel<P, CONTRACT> implements CommonContract.CommonModel {
    public CommonModel(P mPresener) {
        super(mPresener);
    }

    //如果需要公共接口的话  model  就好了  ，其实也可以只要model配置成公共的
    @Override
    public void sendVerificationCode(String phone) {
        //发送成功回调给presenter
        mPresener.response("发送成功");
    }
}
