package com.dao;

import com.models.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDaoI {

    public List<User> getUserList();
}
