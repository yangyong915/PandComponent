/*
 * Copyright 2018 JessYan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.panda.lib_sdk.core;

/**
 * ================================================
 * RouterHub 用来定义路由器的路由地址, 以组件名作为前缀, 对每个组件的路由地址进行分组, 统一查看和管理所有分组的路由地址
 * 路由地址的命名规则为 组件名 + 页面名, 如订单组件的订单详情页的路由地址可以命名为 "/order/OrderDetailActivity"
 * ARouter 将路由地址中第一个 '/' 后面的字符叫作 Group, 比如上面的示例路由地址中 order 就是 Group, 以 order 开头的地址都被分配该 Group 下
 * 切记不同的组件中不能出现同一个 Group, 否则会发生该 Group 下的部分路由地址找不到的情况!!!
 * 所以每个组件使用自己的组件名作为 Group 是比较好的选择, 毕竟组件不会重名
 * <p>
 * Created by JessYan on 30/03/2018 18:07
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
public interface RouterHub {
    /**
     * 组名
     */
    String APP = "/app";//宿主 App 组件
    String BAMBOO = "/bamboo"; //竹园组件
    String CUSTOMERSERVICE = "/customerService";  //客服组件
    String MESSAGE = "/message";  //消息推送组件
    String USER = "/user";  //用户组件
    String ORDER = "/order";  //订单组件
    String PAY = "/pay";   //支付组件
    String SHARE = "/share";   //分享组件

    /**
     * 服务组件, 用于给每个组件暴露特有的服务
     */
    String SERVICE = "_service";


    /**
     * 宿主 App 分组
     */
    String APP_SPLASHACTIVITY = APP + "/SplashActivity";
    String APP_MAINACTIVITY = APP + "/MainActivity";
    String SERVICE_MAINACTIVITY = APP + SERVICE + "/MainActivity";

    String BAMBOO_ACTIVITY = BAMBOO + "/BambooActivity";
    String SERVICE_BAMBOOACTIVITY = BAMBOO + SERVICE + "/BambooActivity";

    String CUSTOMERSERVICE_ACTIVITY = BAMBOO + "/BambooActivity";

    String MESSAGELIST_ACTIVITY = MESSAGE + "/MessageListActivity";
    String SERVICE_MESSAGELISTACTIVITY = MESSAGE + SERVICE + "/MessageListActivity";

    String USERCENTER_ACTIVITY = USER + "/BambooActivity";

}
