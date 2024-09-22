package com.wjunming.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.wjunming.base.BaseEntity;
import com.wjunming.enums.UserSexEnum;
import com.wjunming.enums.UserStatusEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;

@Data
@Entity
@Table(name = "sys_user")
@DynamicInsert
@DynamicUpdate
@EntityListeners(AuditingEntityListener.class)
public class SysUserEntity extends BaseEntity implements Serializable {

    private String code;

    private String name;

    @Enumerated
    @JsonSerialize(using = ToStringSerializer.class)
    private UserSexEnum sex;

    private String phone;

    @Enumerated
    @JsonSerialize(using = ToStringSerializer.class)
    private UserStatusEnum status;

    private String password;
}
