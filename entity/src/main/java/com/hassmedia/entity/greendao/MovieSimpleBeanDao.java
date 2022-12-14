package com.hassmedia.entity.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.hassmedia.entity.MovieSimpleBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MOVIE_SIMPLE_BEAN".
*/
public class MovieSimpleBeanDao extends AbstractDao<MovieSimpleBean, Void> {

    public static final String TABLENAME = "MOVIE_SIMPLE_BEAN";

    /**
     * Properties of entity MovieSimpleBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, int.class, "id", false, "ID");
        public final static Property CreateTime = new Property(1, java.util.Date.class, "createTime", false, "CREATE_TIME");
        public final static Property UpdateTime = new Property(2, java.util.Date.class, "updateTime", false, "UPDATE_TIME");
        public final static Property Title = new Property(3, String.class, "title", false, "TITLE");
        public final static Property Pinyin = new Property(4, String.class, "pinyin", false, "PINYIN");
        public final static Property Spell = new Property(5, String.class, "spell", false, "SPELL");
        public final static Property OriginalTitle = new Property(6, String.class, "originalTitle", false, "ORIGINAL_TITLE");
        public final static Property Aka = new Property(7, String.class, "aka", false, "AKA");
        public final static Property Rating = new Property(8, String.class, "rating", false, "RATING");
        public final static Property ImageUrlHorizontal = new Property(9, String.class, "imageUrlHorizontal", false, "IMAGE_URL_HORIZONTAL");
        public final static Property ImageUrlVertical = new Property(10, String.class, "imageUrlVertical", false, "IMAGE_URL_VERTICAL");
        public final static Property Subtype = new Property(11, String.class, "subtype", false, "SUBTYPE");
        public final static Property Pubdates = new Property(12, String.class, "pubdates", false, "PUBDATES");
        public final static Property MainlandPubdate = new Property(13, java.util.Date.class, "mainlandPubdate", false, "MAINLAND_PUBDATE");
        public final static Property Year = new Property(14, String.class, "year", false, "YEAR");
        public final static Property Languages = new Property(15, String.class, "languages", false, "LANGUAGES");
        public final static Property Durations = new Property(16, String.class, "durations", false, "DURATIONS");
        public final static Property Summary = new Property(17, String.class, "summary", false, "SUMMARY");
        public final static Property Count = new Property(18, int.class, "count", false, "COUNT");
        public final static Property TrailerUrls = new Property(19, String.class, "trailerUrls", false, "TRAILER_URLS");
        public final static Property Pay = new Property(20, boolean.class, "pay", false, "PAY");
        public final static Property Price = new Property(21, int.class, "price", false, "PRICE");
        public final static Property PayHour = new Property(22, int.class, "payHour", false, "PAY_HOUR");
        public final static Property SourceType = new Property(23, String.class, "sourceType", false, "SOURCE_TYPE");
    }


    public MovieSimpleBeanDao(DaoConfig config) {
        super(config);
    }
    
    public MovieSimpleBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MOVIE_SIMPLE_BEAN\" (" + //
                "\"ID\" INTEGER NOT NULL ," + // 0: id
                "\"CREATE_TIME\" INTEGER," + // 1: createTime
                "\"UPDATE_TIME\" INTEGER," + // 2: updateTime
                "\"TITLE\" TEXT," + // 3: title
                "\"PINYIN\" TEXT," + // 4: pinyin
                "\"SPELL\" TEXT," + // 5: spell
                "\"ORIGINAL_TITLE\" TEXT," + // 6: originalTitle
                "\"AKA\" TEXT," + // 7: aka
                "\"RATING\" TEXT," + // 8: rating
                "\"IMAGE_URL_HORIZONTAL\" TEXT," + // 9: imageUrlHorizontal
                "\"IMAGE_URL_VERTICAL\" TEXT," + // 10: imageUrlVertical
                "\"SUBTYPE\" TEXT," + // 11: subtype
                "\"PUBDATES\" TEXT," + // 12: pubdates
                "\"MAINLAND_PUBDATE\" INTEGER," + // 13: mainlandPubdate
                "\"YEAR\" TEXT," + // 14: year
                "\"LANGUAGES\" TEXT," + // 15: languages
                "\"DURATIONS\" TEXT," + // 16: durations
                "\"SUMMARY\" TEXT," + // 17: summary
                "\"COUNT\" INTEGER NOT NULL ," + // 18: count
                "\"TRAILER_URLS\" TEXT," + // 19: trailerUrls
                "\"PAY\" INTEGER NOT NULL ," + // 20: pay
                "\"PRICE\" INTEGER NOT NULL ," + // 21: price
                "\"PAY_HOUR\" INTEGER NOT NULL ," + // 22: payHour
                "\"SOURCE_TYPE\" TEXT);"); // 23: sourceType
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MOVIE_SIMPLE_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MovieSimpleBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        java.util.Date createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindLong(2, createTime.getTime());
        }
 
        java.util.Date updateTime = entity.getUpdateTime();
        if (updateTime != null) {
            stmt.bindLong(3, updateTime.getTime());
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(4, title);
        }
 
        String pinyin = entity.getPinyin();
        if (pinyin != null) {
            stmt.bindString(5, pinyin);
        }
 
        String spell = entity.getSpell();
        if (spell != null) {
            stmt.bindString(6, spell);
        }
 
        String originalTitle = entity.getOriginalTitle();
        if (originalTitle != null) {
            stmt.bindString(7, originalTitle);
        }
 
        String aka = entity.getAka();
        if (aka != null) {
            stmt.bindString(8, aka);
        }
 
        String rating = entity.getRating();
        if (rating != null) {
            stmt.bindString(9, rating);
        }
 
        String imageUrlHorizontal = entity.getImageUrlHorizontal();
        if (imageUrlHorizontal != null) {
            stmt.bindString(10, imageUrlHorizontal);
        }
 
        String imageUrlVertical = entity.getImageUrlVertical();
        if (imageUrlVertical != null) {
            stmt.bindString(11, imageUrlVertical);
        }
 
        String subtype = entity.getSubtype();
        if (subtype != null) {
            stmt.bindString(12, subtype);
        }
 
        String pubdates = entity.getPubdates();
        if (pubdates != null) {
            stmt.bindString(13, pubdates);
        }
 
        java.util.Date mainlandPubdate = entity.getMainlandPubdate();
        if (mainlandPubdate != null) {
            stmt.bindLong(14, mainlandPubdate.getTime());
        }
 
        String year = entity.getYear();
        if (year != null) {
            stmt.bindString(15, year);
        }
 
        String languages = entity.getLanguages();
        if (languages != null) {
            stmt.bindString(16, languages);
        }
 
        String durations = entity.getDurations();
        if (durations != null) {
            stmt.bindString(17, durations);
        }
 
        String summary = entity.getSummary();
        if (summary != null) {
            stmt.bindString(18, summary);
        }
        stmt.bindLong(19, entity.getCount());
 
        String trailerUrls = entity.getTrailerUrls();
        if (trailerUrls != null) {
            stmt.bindString(20, trailerUrls);
        }
        stmt.bindLong(21, entity.getPay() ? 1L: 0L);
        stmt.bindLong(22, entity.getPrice());
        stmt.bindLong(23, entity.getPayHour());
 
        String sourceType = entity.getSourceType();
        if (sourceType != null) {
            stmt.bindString(24, sourceType);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MovieSimpleBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        java.util.Date createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindLong(2, createTime.getTime());
        }
 
        java.util.Date updateTime = entity.getUpdateTime();
        if (updateTime != null) {
            stmt.bindLong(3, updateTime.getTime());
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(4, title);
        }
 
        String pinyin = entity.getPinyin();
        if (pinyin != null) {
            stmt.bindString(5, pinyin);
        }
 
        String spell = entity.getSpell();
        if (spell != null) {
            stmt.bindString(6, spell);
        }
 
        String originalTitle = entity.getOriginalTitle();
        if (originalTitle != null) {
            stmt.bindString(7, originalTitle);
        }
 
        String aka = entity.getAka();
        if (aka != null) {
            stmt.bindString(8, aka);
        }
 
        String rating = entity.getRating();
        if (rating != null) {
            stmt.bindString(9, rating);
        }
 
        String imageUrlHorizontal = entity.getImageUrlHorizontal();
        if (imageUrlHorizontal != null) {
            stmt.bindString(10, imageUrlHorizontal);
        }
 
        String imageUrlVertical = entity.getImageUrlVertical();
        if (imageUrlVertical != null) {
            stmt.bindString(11, imageUrlVertical);
        }
 
        String subtype = entity.getSubtype();
        if (subtype != null) {
            stmt.bindString(12, subtype);
        }
 
        String pubdates = entity.getPubdates();
        if (pubdates != null) {
            stmt.bindString(13, pubdates);
        }
 
        java.util.Date mainlandPubdate = entity.getMainlandPubdate();
        if (mainlandPubdate != null) {
            stmt.bindLong(14, mainlandPubdate.getTime());
        }
 
        String year = entity.getYear();
        if (year != null) {
            stmt.bindString(15, year);
        }
 
        String languages = entity.getLanguages();
        if (languages != null) {
            stmt.bindString(16, languages);
        }
 
        String durations = entity.getDurations();
        if (durations != null) {
            stmt.bindString(17, durations);
        }
 
        String summary = entity.getSummary();
        if (summary != null) {
            stmt.bindString(18, summary);
        }
        stmt.bindLong(19, entity.getCount());
 
        String trailerUrls = entity.getTrailerUrls();
        if (trailerUrls != null) {
            stmt.bindString(20, trailerUrls);
        }
        stmt.bindLong(21, entity.getPay() ? 1L: 0L);
        stmt.bindLong(22, entity.getPrice());
        stmt.bindLong(23, entity.getPayHour());
 
        String sourceType = entity.getSourceType();
        if (sourceType != null) {
            stmt.bindString(24, sourceType);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public MovieSimpleBean readEntity(Cursor cursor, int offset) {
        MovieSimpleBean entity = new MovieSimpleBean( //
            cursor.getInt(offset + 0), // id
            cursor.isNull(offset + 1) ? null : new java.util.Date(cursor.getLong(offset + 1)), // createTime
            cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)), // updateTime
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // title
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // pinyin
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // spell
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // originalTitle
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // aka
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // rating
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // imageUrlHorizontal
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // imageUrlVertical
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // subtype
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // pubdates
            cursor.isNull(offset + 13) ? null : new java.util.Date(cursor.getLong(offset + 13)), // mainlandPubdate
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // year
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // languages
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // durations
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // summary
            cursor.getInt(offset + 18), // count
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // trailerUrls
            cursor.getShort(offset + 20) != 0, // pay
            cursor.getInt(offset + 21), // price
            cursor.getInt(offset + 22), // payHour
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23) // sourceType
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MovieSimpleBean entity, int offset) {
        entity.setId(cursor.getInt(offset + 0));
        entity.setCreateTime(cursor.isNull(offset + 1) ? null : new java.util.Date(cursor.getLong(offset + 1)));
        entity.setUpdateTime(cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)));
        entity.setTitle(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPinyin(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSpell(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setOriginalTitle(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAka(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setRating(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setImageUrlHorizontal(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setImageUrlVertical(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setSubtype(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setPubdates(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setMainlandPubdate(cursor.isNull(offset + 13) ? null : new java.util.Date(cursor.getLong(offset + 13)));
        entity.setYear(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setLanguages(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setDurations(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setSummary(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setCount(cursor.getInt(offset + 18));
        entity.setTrailerUrls(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setPay(cursor.getShort(offset + 20) != 0);
        entity.setPrice(cursor.getInt(offset + 21));
        entity.setPayHour(cursor.getInt(offset + 22));
        entity.setSourceType(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(MovieSimpleBean entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(MovieSimpleBean entity) {
        return null;
    }

    @Override
    public boolean hasKey(MovieSimpleBean entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
