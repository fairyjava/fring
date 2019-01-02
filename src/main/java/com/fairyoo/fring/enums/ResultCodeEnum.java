package com.fairyoo.fring.enums;

import com.fairyoo.fring.constant.FringConstant;

/**
 * 错误码
 *
 * @author MengYi at 2019-01-02 21:00
 */
public enum ResultCodeEnum {

    Success(200, "操作成功"),
    SignError(500, "签名错误"),
    BizError(FringConstant.Prefix + 400, "业务异常"),
    SysError(FringConstant.Prefix + 501, "服务异常"),
    InputError(FringConstant.Prefix + 502, "参数错误[%s]"),
    UnResponse(FringConstant.Prefix + 503, "网络异常");

    /**
     * 枚举类型
     */
    private int code;
    /**
     * 枚举名字
     */
    private String msg;

    ResultCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
