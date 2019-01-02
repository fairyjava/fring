package com.fairyoo.fring.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author MengYi at 2018-12-29 09:51
 */
public class FringTimeUtil {

    private static final SimpleDateFormat FORMAT_YYYYMMDDHHMMSS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 获取yyyy-MM-dd hh:mm:ss格式日期
     *
     * @param date 所要格式化的日期值
     * @return 返回格式化后的日期字符串
     */
    public static String yyyyMMddHHmmss(Date date) {
        return FORMAT_YYYYMMDDHHMMSS.format(date);
    }
}
