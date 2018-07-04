package com.Injection.UsingAnnotationToInject.UserServiceImpl2;

import com.dao.UserDaoI;
import com.models.User;
import com.services.UserServiceI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService4")
public class SecondUserServiceImpl implements UserServiceI {

    @Resource
    private UserDaoI userDao2;

    public List<User> getUserList() {
        return userDao2.getUserList();
    }
}
