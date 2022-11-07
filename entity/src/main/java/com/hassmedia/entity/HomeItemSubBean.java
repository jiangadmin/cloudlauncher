package com.hassmedia.entity;

public class HomeItemSubBean {

    private String router;//路由
    private String name;
    private int index;
    private String params;
    private String url;
    private String sourceForm;

    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSourceForm() {
        return sourceForm;
    }

    public void setSourceForm(String sourceForm) {
        this.sourceForm = sourceForm;
    }

    @Override
    public String toString() {
        return "HomeItemSubBean{" +
                "router='" + router + '\'' +
                ", name='" + name + '\'' +
                ", index=" + index +
                ", params='" + params + '\'' +
                ", url='" + url + '\'' +
                ", sourceForm='" + sourceForm + '\'' +
                '}';
    }
}
