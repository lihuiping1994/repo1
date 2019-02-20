package com.lhp.service;

import com.lhp.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService extends UserDetailsService{
    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    List<UserInfo> findAll();

    void save(UserInfo info);

    UserInfo findById(String id);

}
