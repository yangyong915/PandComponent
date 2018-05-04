package com.panda.module_message.mvp.presenter;

import android.app.Application;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;

import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;

import com.panda.module_message.mvp.contract.MessageListContract;


@ActivityScope
public class MessageListPresenter extends BasePresenter<MessageListContract.Model, MessageListContract.View> {
    private RxErrorHandler mErrorHandler;
    private Application mApplication;
    private AppManager mAppManager;

    @Inject
    public MessageListPresenter(MessageListContract.Model model, MessageListContract.View rootView
            , RxErrorHandler handler, Application application
            , AppManager appManager) {
        super(model, rootView);
        this.mErrorHandler = handler;
        this.mApplication = application;
        this.mAppManager = appManager;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mApplication = null;
    }

}
