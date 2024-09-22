package com.wjunming.controller;

import com.wjunming.base.ResultEntity;
import com.wjunming.base.ResultMsg;
import com.wjunming.entity.SysUserEntity;
import com.wjunming.service.SysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class SysUserController {

    private final SysUserService sysUserService;

    @GetMapping("/{id}")
    public ResultEntity<SysUserEntity> getUser(@PathVariable("id") long id) {
        SysUserEntity sysUser = sysUserService.getUserById(id);
        return ResultEntity.success(ResultMsg.QUERY_SUCCESS, sysUser);
    }

    @PostMapping()
    public ResultEntity<Void> saveUser(@RequestBody SysUserEntity sysUser) {
        sysUserService.saveUser(sysUser);
        return ResultEntity.success(ResultMsg.SAVE_SUCCESS);
    }
}
