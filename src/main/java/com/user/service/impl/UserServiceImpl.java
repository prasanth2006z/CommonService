package com.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.user.dao.UserDao;
import com.user.service.UserService;

public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  @Override
  public String getUserDetails(int userId) {
    return userDao.getUserDetails(userId);
  }

}
