package com.wjunming.repository;

import com.wjunming.entity.SysUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends JpaRepository<SysUserEntity, Long> {
}
