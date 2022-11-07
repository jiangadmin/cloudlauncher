package com.hassmedia.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by fanjianchao on 2022/2/22 14:07
 */
@Entity
public class HomeUiBean {
    @Id
    private Long id;
    private String tips;
    private String tvMoreUrl;
    private String bgImg;
    private String templateType;
    private String logo;
    private String bottomIcon;

    @Generated(hash = 495135887)
    public HomeUiBean(Long id, String tips, String tvMoreUrl, String bgImg,
            String templateType, String logo, String bottomIcon) {
        this.id = id;
        this.tips = tips;
        this.tvMoreUrl = tvMoreUrl;
        this.bgImg = bgImg;
        this.templateType = templateType;
        this.logo = logo;
        this.bottomIcon = bottomIcon;
    }

    @Generated(hash = 603078535)
    public HomeUiBean() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTips() {
        return this.tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getTvMoreUrl() {
        return this.tvMoreUrl;
    }

    public void setTvMoreUrl(String tvMoreUrl) {
        this.tvMoreUrl = tvMoreUrl;
    }

    public String getBgImg() {
        return this.bgImg;
    }

    public void setBgImg(String bgImg) {
        this.bgImg = bgImg;
    }

    public String getTemplateType() {
        return this.templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBottomIcon() {
        return this.bottomIcon;
    }

    public void setBottomIcon(String bottomIcon) {
        this.bottomIcon = bottomIcon;
    }
}
