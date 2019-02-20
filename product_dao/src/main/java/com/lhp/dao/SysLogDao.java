package com.lhp.dao;

import com.lhp.domain.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysLogDao {

    @Insert("INSERT INTO SYSLOG (visitTime,username,ip,url,executionTime,method) VALUES (#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
    void save(SysLog sysLog);

    @Select("select * from SYSLOG")
    List<SysLog> findAll();
}
