package com.panda.module_bamboogarden.di.component;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.panda.module_bamboogarden.di.module.BambooActivityModule;

import com.panda.module_bamboogarden.mvp.ui.activity.BambooActivity;

@ActivityScope
@Component(modules = BambooActivityModule.class, dependencies = AppComponent.class)
public interface BambooActivityComponent {
    void inject(BambooActivity activity);
}