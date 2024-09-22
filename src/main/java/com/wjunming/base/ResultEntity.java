package com.wjunming.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude
public class ResultEntity<T> {

    private int code;

    private boolean success;

    private String msg;

    private T data;

    public static <T> ResultEntity<T> success(ResultMsg resultMsg) {
        return success(resultMsg, null);
    }

    public static <T> ResultEntity<T> success(String message) {
        return success(message, null);
    }

    public static <T> ResultEntity<T> success(ResultMsg resultMsg, T data) {
        ResultEntity<T> resultEntity = new ResultEntity<>();
        resultEntity.setCode(ResultCode.SUCCESS.getCode());
        resultEntity.setSuccess(true);
        resultEntity.setMsg(resultMsg.getMessage());
        resultEntity.setData(data);
        return resultEntity;
    }

    public static <T> ResultEntity<T> success(String message, T data) {
        ResultEntity<T> resultEntity = new ResultEntity<>();
        resultEntity.setCode(ResultCode.SUCCESS.getCode());
        resultEntity.setSuccess(true);
        resultEntity.setMsg(message);
        resultEntity.setData(data);
        return resultEntity;
    }

    public static <T> ResultEntity<T> fail(ResultMsg resultMsg) {
        return fail(resultMsg, null);
    }

    public static <T> ResultEntity<T> fail(String message) {
        return fail(message, null);
    }

    public static <T> ResultEntity<T> fail(ResultCode resultCode, String message) {
        return fail(resultCode, message, null);
    }

    public static <T> ResultEntity<T> fail(ResultMsg resultMsg, T data) {
        return fail(ResultCode.FAIL, resultMsg, data);
    }

    public static <T> ResultEntity<T> fail(String message, T data) {
        return fail(ResultCode.FAIL, message, data);
    }

    public static <T> ResultEntity<T> fail(ResultCode resultCode, ResultMsg resultMsg, T data) {
        ResultEntity<T> resultEntity = new ResultEntity<>();
        resultEntity.setCode(resultCode.getCode());
        resultEntity.setSuccess(false);
        resultEntity.setMsg(resultMsg.getMessage());
        resultEntity.setData(data);
        return resultEntity;
    }

    public static <T> ResultEntity<T> fail(ResultCode resultCode, String message, T data) {
        ResultEntity<T> resultEntity = new ResultEntity<>();
        resultEntity.setCode(resultCode.getCode());
        resultEntity.setSuccess(false);
        resultEntity.setMsg(message);
        resultEntity.setData(data);
        return resultEntity;
    }
}
