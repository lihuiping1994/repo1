package com.lhp.dao;

import com.lhp.domain.Member;
import org.apache.ibatis.annotations.Select;

public interface MemberDao {
    @Select("select * from member where id=#{id}")
    public Member findMemberById(String id);
}
