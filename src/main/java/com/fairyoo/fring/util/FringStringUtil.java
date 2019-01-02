package com.fairyoo.fring.util;

import java.util.List;

/**
 * @author MengYi at 2018-12-29 09:50
 */
public class FringStringUtil {

    /**
     * 将字符串转化为指定枚举类型的枚举值（注意：1、统一转为大写处理；2、方法目前只支持枚举字符串，不支持自定义的属性值）
     *
     * @param str          待转化的字符串
     * @param enumType     枚举定义类类型
     * @param defaultValue 转化失败时的默认返回值
     * @param <T>          枚举定义类型
     * @return 转化后的枚举值
     */
    public static <T extends Enum<T>> T toEnum(String str, Class<T> enumType, T defaultValue) {
        return toEnum(str, enumType, defaultValue, true);
    }

    /**
     * 将字符串转化为指定枚举类型的枚举值（注意：1、大小写敏感；2、方法目前只支持枚举字符串，不支持自定义的属性值）
     *
     * @param str          待转化的字符串
     * @param enumType     枚举定义类类型
     * @param defaultValue 转化失败时的默认返回值
     * @param ignoreCase   是否忽略大小写，将str转化为大写后，进行枚举转化
     * @param <T>          枚举定义类型
     * @return 转化后的枚举值
     */
    public static <T extends Enum<T>> T toEnum(String str, Class<T> enumType, T defaultValue, boolean ignoreCase) {
        if (str != null && !str.isEmpty()) {
            try {
                if (ignoreCase) {
                    str = str.toUpperCase();
                }
                return Enum.valueOf(enumType, str);

            } catch (RuntimeException ex) {
                return defaultValue;
            }
        }
        return defaultValue;
    }

    /**
     * 检测value值是否为null或empty
     *
     * @param val 待检测的字符串
     * @return 为null或empty时，返回true，否则返回false
     */
    public static boolean isNullOrEmpty(String val) {
        return val == null || val.isEmpty();
    }

    /**
     * 字符串转为boolean值
     *
     * @param source       待转化字符串
     * @param defaultValue 转化失败的默认值
     * @return 返回true或false
     */
    public static boolean toBoolean(String source, boolean defaultValue) {
        if (!isNullOrEmpty(source)) {
            try {
                return Boolean.valueOf(source);
            } catch (Exception ex) {
                return defaultValue;
            }
        }
        return defaultValue;
    }

    /**
     * 将字符串转化为integer类型，转化失败则默认返回-1
     *
     * @param source 待转化的字符串
     * @return 返回int类型的值
     */
    public static Integer toInteger(String source) {
        return toInteger(source, -1);
    }

    /**
     * 将字符串转化为integer类型，转化失败则返回defaultValue值
     *
     * @param source       待转化的字符串
     * @param defaultValue 转化失败时，返回的默认值
     * @return 返回int类型的值
     */
    public static Integer toInteger(String source, Integer defaultValue) {
        if (source != null && !source.isEmpty()) {
            try {
                return Integer.parseInt(source);
            } catch (Exception ex) {
                return defaultValue;
            }
        }
        return defaultValue;
    }

    /**
     * 将字符串转化为long类型，转化失败则返回-1
     *
     * @param source 待转化的字符串
     * @return 转化后的值
     */
    public static long toInt64(String source) {
        return toInt64(source, -1L);
    }

    /**
     * 将字符串转化为long类型，转化失败则返回defaultValue
     *
     * @param source       待转化的字符串
     * @param defaultValue 转化失败返回的默认值
     * @return 转化后的值
     */
    public static long toInt64(String source, long defaultValue) {
        if (source != null && !source.isEmpty()) {
            try {
                return Long.parseLong(source);
            } catch (Exception ex) {
                return defaultValue;
            }
        }
        return defaultValue;
    }

    public static String listToString(List<?> stringList, String split) {
        if (stringList == null) {
            return null;
        }
        int count = stringList.size();
        StringBuilder result = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < count; i++) {
            if (flag) {
                result.append(split);
            } else {
                flag = true;
            }
            result.append(stringList.get(i));
        }
        return result.toString();
    }
}
