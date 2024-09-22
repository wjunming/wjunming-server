package com.wjunming.service;

import com.wjunming.entity.SysUserEntity;

public interface SysUserService {

    SysUserEntity getUserById(long id);

    void saveUser(SysUserEntity sysUser);
}
