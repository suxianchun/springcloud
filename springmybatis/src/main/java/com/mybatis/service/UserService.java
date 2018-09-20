package com.mybatis.service;

import com.mybatis.model.User;

import java.util.List;

/**
 * Created by x.su on 2018-09-18.
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUsers(int pageNum, int pageSize);
}
