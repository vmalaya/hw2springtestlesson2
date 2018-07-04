package com.Injection.UsingAnnotationToInject.UserServiceImpl1;

import com.dao.UserDaoI;
import com.models.User;
import com.services.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService2")
public class SecondUserServiceImpl implements UserServiceI {

    @Autowired
    @Qualifier("userDao2")
    private UserDaoI userDao;

    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
