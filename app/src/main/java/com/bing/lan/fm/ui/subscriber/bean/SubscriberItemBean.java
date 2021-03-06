package com.bing.lan.fm.ui.subscriber.bean;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * @author 蓝兵
 * @time 2017/3/6  8:45
 */
public class SubscriberItemBean extends RealmObject {


    @PrimaryKey
    public long id;
    public String name;
    //必须要有一个无参构造器
    public SubscriberItemBean() {
    }

    public SubscriberItemBean(String name) {
        this.name = name;
    }
}
