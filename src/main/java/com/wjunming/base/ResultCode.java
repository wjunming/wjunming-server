package com.wjunming.base;

import lombok.Getter;

@Getter
public enum ResultCode {

    SUCCESS(0),
    FAIL(-1),
    ARGUMENT_NOT_VALID(-2);

    private final int code;

    ResultCode(int code) {
        this.code = code;
    }
}
