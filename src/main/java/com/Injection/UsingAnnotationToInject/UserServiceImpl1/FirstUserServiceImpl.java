package com.Injection.UsingAnnotationToInject.UserServiceImpl1;

import com.dao.UserDaoI;
import com.models.User;
import com.services.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService1")
public class FirstUserServiceImpl implements UserServiceI {

    @Autowired
    @Qualifier("userDao1")
    private UserDaoI userDao2;
//
//    public FirstUserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public List<User> getUserList() {
        return userDao2.getUserList();
    }
}
