package com.panda.module_message.di.component;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.panda.module_message.di.module.MessageListModule;

import com.panda.module_message.mvp.ui.activity.MessageListActivity;

@ActivityScope
@Component(modules = MessageListModule.class, dependencies = AppComponent.class)
public interface MessageListComponent {
    void inject(MessageListActivity activity);
}