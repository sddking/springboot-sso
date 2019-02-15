package com.sso.oauth2server.service;


import com.sso.oauth2server.domain.SysUser;

public interface UserService {

    /**
     * 根据用户名获取系统用户
     */
    SysUser getUserByName(String username);

}
