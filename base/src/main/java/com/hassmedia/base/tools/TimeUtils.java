package com.hassmedia.base.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TimeUtils
 * 
 * @author <a href="http://www.trinea.cn" target="_blank">Trinea</a> 2013-8-24
 */
public class TimeUtils {

    public static final SimpleDateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat DATE_FORMAT_DATE    = new SimpleDateFormat("yyyy-MM-dd");

    private TimeUtils() {
        throw new AssertionError();
    }

    /**
     * long time to string
     * 
     * @param timeInMillis timeInMillis
     * @param dateFormat   dateFormat
     * @return String
     */
    public static String getTime(long timeInMillis, SimpleDateFormat dateFormat) {
        return dateFormat.format(new Date(timeInMillis));
    }

    /**
     * long time to string, format is {@link #DEFAULT_DATE_FORMAT}
     * 
     * @param timeInMillis time
     * @return String
     */
    public static String getTime(long timeInMillis) {
        return getTime(timeInMillis, DEFAULT_DATE_FORMAT);
    }

    /**
     * get current time in milliseconds
     * 
     * @return long
     */
    public static long getCurrentTimeInLong() {
        return System.currentTimeMillis();
    }

    /**
     * get current time in milliseconds, format is {@link #DEFAULT_DATE_FORMAT}
     * 
     * @return  String
     */
    public static String getCurrentTimeInString() {
        return getTime(getCurrentTimeInLong());
    }

    /**
     * get current time in milliseconds
     *
     * @param dateFormat    dateFormat
     * @return String
     */
    public static String getCurrentTimeInString(SimpleDateFormat dateFormat) {

        return getTime(getCurrentTimeInLong(), dateFormat);
    }

    public static String parseTimeToString(long time) {

        time /= 1000;
        int minute = (int) (time / 60);
        // int hour = minute / 60;
        int second = (int) (time % 60);
        minute %= 60;
        return String.format("%02d:%02d", minute, second);
    }


    public static String formatLongTime(long time) {
        // TODO Auto-generated method stub
        if (time == 0) {
            return "00:00:00";
        }
        long h = time / 1000 / 60 / 60 % 60;
        long m = time / 1000 / 60 % 60;
        long s = time / 1000 % 60;
        return (h > 9 ? h : "0" + h)+":"+ (m > 9 ? m : "0" + m) + ":" + (s > 9 ? s : "0" + s);
    }

    /**
     * 格式化时间
     *
     * @param time
     *            时间值
     * @return 时间
     */
    public static String formatTime(int time) {
        // TODO Auto-generated method stub
        if (time == 0) {
            return "00:00";
        }
        time = time / 1000;
        int m = time / 60 % 60;
        int s = time % 60;
        return (m > 9 ? m : "0" + m) + ":" + (s > 9 ? s : "0" + s);
    }

}
