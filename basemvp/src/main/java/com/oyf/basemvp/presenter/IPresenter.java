package com.oyf.basemvp.presenter;

import com.oyf.basemvp.model.IModel;
import com.oyf.basemvp.view.IView;

/**
 * @创建者 oyf
 * @创建时间 2019/11/28 11:03
 * @描述
 **/
public interface IPresenter<M extends IModel, V extends IView> {
    void onCreat();

    M creatModel();

    V getView();

    void bindView(V v);

    void detachView();
}
