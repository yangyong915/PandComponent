package com.panda.module_message.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import com.panda.lib_sdk.core.RouterHub;
import com.panda.module_message.di.component.DaggerMessageListComponent;
import com.panda.module_message.di.module.MessageListModule;
import com.panda.module_message.mvp.contract.MessageListContract;
import com.panda.module_message.mvp.presenter.MessageListPresenter;

import com.panda.module_message.R;


import static com.jess.arms.utils.Preconditions.checkNotNull;

@Route(path = RouterHub.MESSAGELIST_ACTIVITY)
public class MessageListActivity extends BaseActivity<MessageListPresenter> implements MessageListContract.View {


    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        DaggerMessageListComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .messageListModule(new MessageListModule(this))
                .build()
                .inject(this);
    }


    @Override
    public int initView(Bundle savedInstanceState) {
        return R.layout.activity_message_list;
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
