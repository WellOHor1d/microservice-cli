package com.ytfz.mapper;

import com.ytfz.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by XY on 2017/8/31.
 * 
 */
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> listUsers();
}
