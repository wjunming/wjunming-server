package com.wjunming.enums;

import lombok.Getter;

@Getter
public enum UserStatusEnum {

    ENABLED("启用"),

    DISABLED("停用");

    private final String desc;

    UserStatusEnum(String desc) {
        this.desc = desc;
    }


    @Override
    public String toString() {
        return desc;
    }
}
