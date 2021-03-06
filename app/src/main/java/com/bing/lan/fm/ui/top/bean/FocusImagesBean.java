package com.bing.lan.fm.ui.top.bean;

import java.util.List;


public class FocusImagesBean {
    /**
     * list : [{"activityId":153,"focusCurrentId":9488,"id":3791,"isShare":true,"is_External_url":false,"longTitle":"全球华语播客巅峰榜（第89期）","pic":"http://fdfs.xmcdn.com/group18/M06/B5/5C/wKgJKli8y-2j6ipLAAEW5hv2d7A403_android_large.jpg","shortTitle":"全球华语播客巅峰榜","type":8,"url":"http://m.ximalaya.com/xmposter/top_list?app=iting"}]
     * ret : 0
     * title : 焦点图
     */

    private int ret;
    private String title;
    private List<ListBean> list;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

}
