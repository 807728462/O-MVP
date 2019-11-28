package com.oyf.basemvp.model;

import com.oyf.basemvp.presenter.IPresenter;

/**
 * @创建者 oyf
 * @创建时间 2019/11/28 11:31
 * @描述
 **/
public abstract class BaseModel<P extends IPresenter, CONTRACT> implements IModel {
    protected P mPresener;

    public BaseModel(P mPresener) {
        this.mPresener = mPresener;
    }

    public abstract CONTRACT getContract();
}
