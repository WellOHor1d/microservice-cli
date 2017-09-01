package com.ytfz.service;

import com.ytfz.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by XY on 2017/8/31 17:03.
 * 
 */
public interface IUserService {
    List<User> listUsers();
}
