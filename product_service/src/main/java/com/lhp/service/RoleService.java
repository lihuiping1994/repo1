package com.lhp.service;

import com.lhp.domain.Permission;
import com.lhp.domain.Role;

import java.util.List;

public interface RoleService {
    public List<Role> findAll();

    void save(Role role);

    Role findById(String id);

    void deleteRoleById(String id);

    List<Permission> findOtherPermissions(String id);

    void addPermissionToRole(String roleId, String[] ids);
}
