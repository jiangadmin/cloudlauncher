package com.hassmedia.entity;

import java.util.List;

public class HomeItemBean {

    private int index;
    private String type;
    private List<HomeItemSubBean> url;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<HomeItemSubBean> getUrl() {
        return url;
    }

    public void setUrl(List<HomeItemSubBean> url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "HomeItemBean{" +
                "index=" + index +
                ", type='" + type + '\'' +
                ", url=" + url +
                '}';
    }
}
