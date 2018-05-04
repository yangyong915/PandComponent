package com.panda.module_bamboogarden.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.panda.lib_sdk.core.RouterHub;
import com.panda.module_bamboogarden.di.component.DaggerBambooActivityComponent;
import com.panda.module_bamboogarden.di.module.BambooActivityModule;
import com.panda.module_bamboogarden.mvp.contract.BambooActivityContract;
import com.panda.module_bamboogarden.mvp.presenter.BambooActivityPresenter;

import com.panda.module_bamboogarden.R;

@Route(path = RouterHub.BAMBOO_ACTIVITY)
public class BambooActivity extends BaseActivity<BambooActivityPresenter> implements BambooActivityContract.View {


    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        DaggerBambooActivityComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .bambooActivityModule(new BambooActivityModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(Bundle savedInstanceState) {
        return R.layout.activity_bamboo;
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }


    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {

    }

    @Override
    public void launchActivity(@NonNull Intent intent) {

    }

    @Override
    public void killMyself() {

    }

}
