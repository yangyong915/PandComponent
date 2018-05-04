package com.panda.module_message.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.panda.module_message.mvp.contract.MessageListContract;
import com.panda.module_message.mvp.model.MessageListModel;


@Module
public class MessageListModule {
    private MessageListContract.View view;

    /**
     * 构建MessageListModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public MessageListModule(MessageListContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    MessageListContract.View provideMessageListView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    MessageListContract.Model provideMessageListModel(MessageListModel model) {
        return model;
    }
}