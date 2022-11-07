package com.hassmedia.entity;

import android.content.Context;

import com.hassmedia.entity.greendao.DaoMaster;
import com.hassmedia.entity.greendao.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * Created by fanjianchao on 2022/2/22 14:09
 */
public class Ado {
    private static Ado ado = null;
    private final DaoSession daoSession;
    private final String dbName = "hassmedia";

    public Ado(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, dbName);
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    /***
     * 初始化数据库
     * @param context
     */
    public static Ado init(Context context) {
        if (ado == null) {
            ado = new Ado(context);
        }
        return ado;
    }

    public static DaoSession getDaoSession() {
        return ado.daoSession;
    }
}
