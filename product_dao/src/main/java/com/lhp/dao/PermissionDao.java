package com.lhp.dao;

import com.lhp.domain.Permission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PermissionDao {

    @Select("select * from permission where id  not in (select permissionid from ROLE_PERMISSION where roleid=#{id})")
    public Permission findById(String id);

    @Select("select * from permission")
    List<Permission> findAll();

    @Insert("INSERT INTO permission (permissionName,url) VALUES (#{permissionName},#{url})")
    void save(Permission permission);
}
