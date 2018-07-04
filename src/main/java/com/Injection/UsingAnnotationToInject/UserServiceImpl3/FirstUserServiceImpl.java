package com.Injection.UsingAnnotationToInject.UserServiceImpl3;

import com.dao.UserDaoI;
import com.models.User;
import com.services.UserServiceI;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService5")
public class FirstUserServiceImpl implements UserServiceI {

    @Resource
    @Qualifier("UserDao2")
    private UserDaoI userDao1;

    public List<User> getUserList() {
        return userDao1.getUserList();
    }
}
