package com.panda.module_bamboogarden.di.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.panda.lib_sdk.core.RouterHub;
import com.panda.lib_service.bamboo.bean.BambooInfo;
import com.panda.lib_service.bamboo.service.BambooInfoService;

/**
 * Created by yy on 2018/5/4.
 * 描述：
 */
@Route(path = RouterHub.SERVICE_BAMBOOACTIVITY)
public class BambooInfoServiceImp implements BambooInfoService {
    private Context mContext;

    @Override
    public BambooInfo getInfo() {
        return new BambooInfo("竹园主页服务");
    }

    @Override
    public void init(Context context) {
        this.mContext = context;
    }
}
