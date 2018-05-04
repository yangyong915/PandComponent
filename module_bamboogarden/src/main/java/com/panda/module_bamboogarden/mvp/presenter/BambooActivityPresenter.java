package com.panda.module_bamboogarden.mvp.presenter;

import android.app.Application;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;

import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;

import com.panda.module_bamboogarden.mvp.contract.BambooActivityContract;


@ActivityScope
public class BambooActivityPresenter extends BasePresenter<BambooActivityContract.Model, BambooActivityContract.View> {
    private RxErrorHandler mErrorHandler;
    private Application mApplication;
    private AppManager mAppManager;

    @Inject
    public BambooActivityPresenter(BambooActivityContract.Model model, BambooActivityContract.View rootView
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
