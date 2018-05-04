package com.panda.module_message.di.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.panda.lib_sdk.core.RouterHub;
import com.panda.lib_service.message.bean.MessageInfo;
import com.panda.lib_service.message.service.MessageInfoService;

/**
 * Created by yy on 2018/5/4.
 * 描述：
 */
@Route(path = RouterHub.SERVICE_MESSAGELISTACTIVITY)
public class MessageInfoServiceImp implements MessageInfoService {
    private Context mContext;

    @Override
    public MessageInfo getInfo() {
        return new MessageInfo("消息页面服务");
    }

    @Override
    public void init(Context context) {
        this.mContext = context;
    }
}
