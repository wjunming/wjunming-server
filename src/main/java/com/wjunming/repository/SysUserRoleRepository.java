package com.wjunming.repository;

import com.wjunming.entity.SysUserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRoleRepository extends JpaRepository<SysUserRoleEntity, Long> {
}
