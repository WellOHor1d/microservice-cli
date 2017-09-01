package com.ytfz.service.impl;

import com.ytfz.dto.User;
import com.ytfz.mapper.UserMapper;
import com.ytfz.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by XY on 2017/8/31 17:00.
 * 
 */
@Service
public class UserServiceImpl implements IUserService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private UserMapper userMapper;
    
    @Override
    public List<User> listUsers() {
        return userMapper.listUsers();
    }
}
