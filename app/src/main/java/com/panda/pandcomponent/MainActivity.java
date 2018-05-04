package com.panda.pandcomponent;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.panda.lib_sdk.core.RouterHub;
import com.panda.lib_service.bamboo.service.BambooInfoService;
import com.panda.lib_service.message.service.MessageInfoService;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * crate by yy on 2018-5-2
 * describle:
 */
@Route(path = RouterHub.APP_MAINACTIVITY)
public class MainActivity extends BaseActivity {

    @BindView(R.id.bamboogarden)
    Button bamboogarden;
    @BindView(R.id.customerservice)
    Button customerservice;
    @BindView(R.id.message)
    Button message;
    @BindView(R.id.order)
    Button order;
    @BindView(R.id.pay)
    Button pay;
    @BindView(R.id.user)
    Button user;
    @BindView(R.id.name)
    TextView nameText;

    @Autowired(name = RouterHub.SERVICE_BAMBOOACTIVITY)
    BambooInfoService bambooInfoService;  //组件通过接口向外界暴露的功能，这里用于向宿主提供数据
    @Autowired(name = RouterHub.SERVICE_MESSAGELISTACTIVITY)
    MessageInfoService messageInfoService;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        ARouter.getInstance().inject(this);
        //加载组件提供的服务数据
        loadBambooInfo();
        loadMessageInfo();
    }

    private void loadBambooInfo() {
        if (bambooInfoService != null) {
            nameText.append("\nbam:" + bambooInfoService.getInfo().getName());
        }
    }

    private void loadMessageInfo() {
        if (messageInfoService != null) {
            nameText.append("\nmessage:" + bambooInfoService.getInfo().getName());
        }
    }

    @OnClick({R.id.bamboogarden, R.id.customerservice, R.id.message, R.id.order, R.id.pay, R.id.user})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bamboogarden:
                ARouter.getInstance().build(RouterHub.BAMBOO_ACTIVITY).navigation(this);
                break;
            case R.id.customerservice:
                Toast.makeText(this, "还没接入", Toast.LENGTH_SHORT).show();
                break;
            case R.id.message:
                ARouter.getInstance().build(RouterHub.MESSAGELIST_ACTIVITY).navigation(this);
                break;
            case R.id.order:
                Toast.makeText(this, "还没接入", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pay:
                Toast.makeText(this, "还没接入", Toast.LENGTH_SHORT).show();
                break;
            case R.id.user:
                Toast.makeText(this, "还没接入", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
