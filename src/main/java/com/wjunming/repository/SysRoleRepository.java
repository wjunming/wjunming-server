package com.wjunming.repository;

import com.wjunming.entity.SysRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleRepository extends JpaRepository<SysRoleEntity, Long> {
}
