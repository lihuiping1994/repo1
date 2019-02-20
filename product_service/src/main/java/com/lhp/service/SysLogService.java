package com.lhp.service;

import com.lhp.domain.SysLog;

import java.util.List;

public interface SysLogService {
    public void save(SysLog sysLog);

    List<SysLog> findAll();
}
