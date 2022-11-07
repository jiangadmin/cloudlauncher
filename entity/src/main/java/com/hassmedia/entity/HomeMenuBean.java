package com.hassmedia.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by fanjianchao on 2022/2/22 14:05
 */
@Entity
public class HomeMenuBean {
    @Id
    private Long id;
    private String apkPackage;
    private String url;
    private String urlActive;
    private String name;
    private String menuCode;

    @Generated(hash = 173332306)
    public HomeMenuBean(Long id, String apkPackage, String url, String urlActive,
                        String name, String menuCode) {
        this.id = id;
        this.apkPackage = apkPackage;
        this.url = url;
        this.urlActive = urlActive;
        this.name = name;
        this.menuCode = menuCode;
    }

    @Generated(hash = 1416350430)
    public HomeMenuBean() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApkPackage() {
        return this.apkPackage;
    }

    public void setApkPackage(String apkPackage) {
        this.apkPackage = apkPackage;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlActive() {
        return this.urlActive;
    }

    public void setUrlActive(String urlActive) {
        this.urlActive = urlActive;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenuCode() {
        return this.menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }
}
