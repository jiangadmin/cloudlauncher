package com.hassmedia.entity;

import org.greenrobot.greendao.annotation.Entity;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class MovieSimpleBean {

    private int id;
    private Date createTime;
    private Date updateTime;
    private String title;
    private String pinyin;
    private String spell;
    private String originalTitle;
    private String aka;
    private String rating;
    private String imageUrlHorizontal;
    private String imageUrlVertical;
    private String subtype;
    private String pubdates;
    private Date mainlandPubdate;
    private String year;
    private String languages;
    private String durations;
    private String summary;
    private int count;
    private String trailerUrls;
    private boolean pay;
    private int price;
    private int payHour;
    private String sourceType;
    @Generated(hash = 1378120981)
    public MovieSimpleBean(int id, Date createTime, Date updateTime, String title,
            String pinyin, String spell, String originalTitle, String aka,
            String rating, String imageUrlHorizontal, String imageUrlVertical,
            String subtype, String pubdates, Date mainlandPubdate, String year,
            String languages, String durations, String summary, int count,
            String trailerUrls, boolean pay, int price, int payHour,
            String sourceType) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.title = title;
        this.pinyin = pinyin;
        this.spell = spell;
        this.originalTitle = originalTitle;
        this.aka = aka;
        this.rating = rating;
        this.imageUrlHorizontal = imageUrlHorizontal;
        this.imageUrlVertical = imageUrlVertical;
        this.subtype = subtype;
        this.pubdates = pubdates;
        this.mainlandPubdate = mainlandPubdate;
        this.year = year;
        this.languages = languages;
        this.durations = durations;
        this.summary = summary;
        this.count = count;
        this.trailerUrls = trailerUrls;
        this.pay = pay;
        this.price = price;
        this.payHour = payHour;
        this.sourceType = sourceType;
    }
    @Generated(hash = 700323259)
    public MovieSimpleBean() {
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }
    public String getPinyin() {
        return pinyin;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }
    public String getSpell() {
        return spell;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }
    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setAka(String aka) {
        this.aka = aka;
    }
    public String getAka() {
        return aka;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getRating() {
        return rating;
    }

    public void setImageUrlHorizontal(String imageUrlHorizontal) {
        this.imageUrlHorizontal = imageUrlHorizontal;
    }
    public String getImageUrlHorizontal() {
        return imageUrlHorizontal;
    }

    public void setImageUrlVertical(String imageUrlVertical) {
        this.imageUrlVertical = imageUrlVertical;
    }
    public String getImageUrlVertical() {
        return imageUrlVertical;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }
    public String getSubtype() {
        return subtype;
    }

    public void setPubdates(String pubdates) {
        this.pubdates = pubdates;
    }
    public String getPubdates() {
        return pubdates;
    }

    public void setMainlandPubdate(Date mainlandPubdate) {
        this.mainlandPubdate = mainlandPubdate;
    }
    public Date getMainlandPubdate() {
        return mainlandPubdate;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public String getYear() {
        return year;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
    public String getLanguages() {
        return languages;
    }

    public void setDurations(String durations) {
        this.durations = durations;
    }
    public String getDurations() {
        return durations;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getSummary() {
        return summary;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public int getCount() {
        return count;
    }

    public void setTrailerUrls(String trailerUrls) {
        this.trailerUrls = trailerUrls;
    }
    public String getTrailerUrls() {
        return trailerUrls;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }
    public boolean getPay() {
        return pay;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setPayHour(int payHour) {
        this.payHour = payHour;
    }
    public int getPayHour() {
        return payHour;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    public String getSourceType() {
        return sourceType;
    }


}
