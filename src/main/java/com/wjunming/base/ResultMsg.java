package com.wjunming.base;

import lombok.Getter;

@Getter
public enum ResultMsg {

    QUERY_SUCCESS("查询成功"),

    QUERY_FAIL("查询失败"),

    SAVE_SUCCESS("保存成功"),

    SAVE_FAIL("保存失败"),

    UPDATE_SUCCESS("修改成功"),

    UPDATE_FAIL("修改失败"),

    DELETE_SUCCESS("删除成功"),

    DELETE_FAIL("删除失败"),

    IMPORT_SUCCESS("导入成功"),

    IMPORT_FAIL("导入失败"),

    ERROR("服务器繁忙，请稍候再试");

    private final String message;

    ResultMsg(String message) {
        this.message = message;
    }
}
