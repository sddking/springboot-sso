package com.sso.oauth2server.service.impl;

import com.sso.oauth2server.dao.UserDao;
import com.sso.oauth2server.domain.SysUser;
import com.sso.oauth2server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public SysUser getUserByName(String username) {
        return userDao.selectByName(username);
    }
}
