package com.fairyoo.fring.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author MengYi at 2018-12-29 09:48
 */
public class FringJsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String convertObj2String(Object object) {
        String s = null;
        try {
            s = objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return s;
    }

    public static <T> T convertString2Obj(String s, Class<T> clazz) {
        T t = null;
        try {
            t = objectMapper.readValue(s, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static void main(String[] args) {
        String s = "{\"Id\":7417,\"UserMobile\":\"17689272870\",\"UserPassword\":\"c3f19e9a9e987ae3cf74e02a8a7ffbc8\",\"UserName\":\"lll\",\"UserType\":2,\"UserLastLoginTime\":\"\\/Date(1535627222000+0800)\\/\",\"UserLastLoginIp\":\"10.2.3.162\",\"BelongOrOwn\":1,\"BrandId\":446,\"IsAdmin\":false}";

    }
}
