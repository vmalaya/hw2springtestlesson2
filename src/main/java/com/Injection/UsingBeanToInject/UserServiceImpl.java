package com.Injection.UsingBeanToInject;

import com.dao.UserDaoI;
import com.models.User;
import com.services.UserServiceI;

import java.util.List;

public class UserServiceImpl implements UserServiceI {
    private UserDaoI userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDaoI userDao) {
        this.userDao = userDao;
    }

    public void setUserDao1(UserDaoI userDao) {
        this.userDao = userDao;
    }

    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
