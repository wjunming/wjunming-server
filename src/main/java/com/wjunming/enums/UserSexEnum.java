package com.wjunming.enums;

import lombok.Getter;

@Getter
public enum UserSexEnum {

    UNKNOWN("未知"),

    MALE("男"),

    FEMALE("女");

    private final String desc;

    UserSexEnum(String desc) {
        this.desc = desc;
    }


    @Override
    public String toString() {
        return desc;
    }
}
