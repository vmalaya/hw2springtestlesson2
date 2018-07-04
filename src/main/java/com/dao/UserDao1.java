package com.dao;

import com.models.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao1 implements UserDaoI {

    private List<User> userList= Arrays.asList(
            new User("name1", 18),
            new User("name2", 23 ));

    public List<User> getUserList() {
        return userList;
    }
}
