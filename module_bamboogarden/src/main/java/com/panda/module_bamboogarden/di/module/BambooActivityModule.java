package com.panda.module_bamboogarden.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.panda.module_bamboogarden.mvp.contract.BambooActivityContract;
import com.panda.module_bamboogarden.mvp.model.BambooActivityModel;


@Module
public class BambooActivityModule {
    private BambooActivityContract.View view;

    /**
     * 构建BambooActivityModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public BambooActivityModule(BambooActivityContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    BambooActivityContract.View provideBambooActivityView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    BambooActivityContract.Model provideBambooActivityModel(BambooActivityModel model) {
        return model;
    }
}