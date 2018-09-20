package com.mybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.mybatis.mapper.UserMapper;
import com.mybatis.model.User;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by x.su on 2018-09-18.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {

        return userMapper.insertSelective(user);
    }

    @Override
    public List<User> findAllUsers(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return userMapper.selectAllUser();
    }
}
