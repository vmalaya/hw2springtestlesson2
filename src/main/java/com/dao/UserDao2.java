package com.dao;

import com.models.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao2 implements UserDaoI {

    private List<User> userList= Arrays.asList(
            new User("name21", 45),
            new User("name22", 21 ));

    public List<User> getUserList() {
        return userList;
    }
}
