package com.lhp.dao;

import com.lhp.domain.Permission;
import com.lhp.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RoleDao {

    @Select("select * from role where id=(select ROLEID from USERS_ROLE where USERID=#{id})")
    @Results({
            @Result(property = "permissions",column = "id",javaType = java.util.List.class,many = @Many(select = "com.lhp.dao.PermissionDao.findById"))
    })
    public List<Role> findRoleByUserId();

    @Select("select * from role")
    List<Role> findAll();

    @Insert("INSERT INTO ROLE(roleName,roleDesc)VALUES(#{roleName},#{roleDesc})")
    void save(Role role);

    @Select("select * from role where id=#{id}")
    Role findById(String id);

    @Delete("delete from role where id=#{id}")
    void deleteRoleById(String id);

    @Select("select * from permission where id  not in (select permissionid from ROLE_PERMISSION where roleid=#{id})")
    List<Permission> findOtherPermissions(String id);

    @Insert("insert into ROLE_PERMISSION (ROLEID,PERMISSIONID) values (#{roleId},#{id})")
    void addPermissionToRole(@Param("roleId") String roleId, @Param("id")String id);
}
