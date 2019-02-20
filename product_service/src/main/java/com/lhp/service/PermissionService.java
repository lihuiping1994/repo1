package com.lhp.service;

import com.lhp.domain.Permission;

import java.util.List;

public interface PermissionService {
    public List<Permission> findAll();

    void save(Permission permission);

    Permission findById(String id);
}
