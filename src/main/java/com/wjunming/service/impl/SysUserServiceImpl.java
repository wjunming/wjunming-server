package com.wjunming.service.impl;

import com.wjunming.entity.SysUserEntity;
import com.wjunming.repository.SysUserRepository;
import com.wjunming.service.SysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SysUserServiceImpl implements SysUserService {

    private final SysUserRepository sysUserRepository;

    @Override
    public SysUserEntity getUserById(long id) {
        return sysUserRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("用户不存在"));
    }

    @Override
    public void saveUser(SysUserEntity sysUser) {
        sysUserRepository.save(sysUser);
    }
}
