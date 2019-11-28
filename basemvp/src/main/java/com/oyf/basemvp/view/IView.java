package com.oyf.basemvp.view;

import android.content.Context;
import android.os.Bundle;


/**
 * @创建者 oyf
 * @创建时间 2019/11/28 11:02
 * @描述
 **/
public interface IView {
    //一般在这里面定义view界面的公共方法
    void initView(Bundle savedInstanceState);

    void initData(Bundle savedInstanceState);

    void showToast(String text);

    void showLoading();

    void dissLoading();

    boolean useEventBus();

    Context getContext();
}
