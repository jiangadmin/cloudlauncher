package com.hassmedia.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by fanjianchao on 2022/1/12 17:16
 */
@Entity
public class UserEntity {
    @Id
    private String uuid;

    @Generated(hash = 440564571)
    public UserEntity(String uuid) {
        this.uuid = uuid;
    }

    @Generated(hash = 1433178141)
    public UserEntity() {
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
