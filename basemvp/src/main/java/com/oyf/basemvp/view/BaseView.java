package com.oyf.basemvp.view;


import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.oyf.basemvp.presenter.IPresenter;

import org.w3c.dom.Text;

/**
 * @创建者 oyf
 * @创建时间 2019/11/28 11:05
 * @描述
 **/
public abstract class BaseView<P extends IPresenter, CONTRACT> extends AppCompatActivity implements IView {

    protected P mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        initView(savedInstanceState);
        initData(savedInstanceState);
        mPresenter = creatPresenter();
        if (mPresenter != null) {
            mPresenter.onCreat();
        }

        if (useEventBus()) {
            //eventBus注册
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
            mPresenter = null;
        }
        if (useEventBus()) {
            //eventBus反注册
        }
    }

    @Override
    public void initView(Bundle savedInstanceState) {

    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }

    @Override
    public void showToast(final String text) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void showLoading() {
        //显示加载
    }

    @Override
    public void dissLoading() {
        //隐藏加载
    }

    @Override
    public boolean useEventBus() {
        //默认不适用EventBus
        return false;
    }

    @Override
    public Context getContext() {
        return this;
    }

    protected abstract P creatPresenter();

    protected abstract int getLayoutId();
    protected abstract CONTRACT getContract();


}
