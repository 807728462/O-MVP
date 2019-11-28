package com.oyf.basemvp.presenter;

import com.oyf.basemvp.model.IModel;
import com.oyf.basemvp.view.IView;

import java.lang.ref.WeakReference;

/**
 * @创建者 oyf
 * @创建时间 2019/11/28 11:24
 * @描述
 **/
public abstract class BasePresenter<M extends IModel, V extends IView, CONTRACT> implements IPresenter<M, V> {
    protected M mModel;
    protected WeakReference<V> weakReference;

    public BasePresenter(V v) {
        bindView(v);
        mModel = creatModel();
    }

    @Override
    public V getView() {
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override
    public void onCreat() {

    }

    @Override
    public void bindView(V v) {
        this.weakReference = new WeakReference<>(v);
    }

    @Override
    public void detachView() {
        if (mModel != null) {
            //去中断model中请求
        }
    }

    public abstract CONTRACT getContract();
}
