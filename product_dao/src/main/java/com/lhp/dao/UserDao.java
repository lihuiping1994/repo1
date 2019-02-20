package com.lhp.dao;

import com.lhp.domain.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {

    @Select("select * from users where username=#{username}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "id",property = "roles",javaType =java.util.List.class ,many=@Many
                    (select = "com.lhp.dao.RoleDao.findRoleByUserId"))
    })
    UserInfo userByUsername(String username);

    @Select("select * from users")
    List<UserInfo> findAll();

    @Insert("insert into users(email,username,password,phoneNum,status) values(#{email},#{username},#{password},#{phoneNum},#{status})")
    void save(UserInfo info);

    @Select("select * from users where id=#{id}")
    @Results({
            @Result(column = "id" ,property = "roles",javaType = java.util.List.class,many = @Many
                    (select = "com.lhp.dao.RoleDao.findRoleByUserId"))
    })
    UserInfo findById(String id);
}

