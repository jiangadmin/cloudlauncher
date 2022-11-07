package com.hassmedia.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by fanjianchao on 2022/2/22 14:04
 */
@Entity
public class HomeChannelBean {
    private String url;
    private String name;
    private String num;

    @Generated(hash = 507928585)
    public HomeChannelBean(String url, String name, String num) {
        this.url = url;
        this.name = name;
        this.num = num;
    }

    @Generated(hash = 1133703702)
    public HomeChannelBean() {
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return this.num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
