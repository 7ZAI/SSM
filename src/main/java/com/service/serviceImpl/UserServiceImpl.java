package com.service.serviceImpl;

import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:binblink
 * @Description
 * @Date: Create on  2019/8/10 10:38
 * @Modified By:
 * @Version:1.0.0
 **/
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) throws Exception {
        return userMapper.insertUser(user);
    }

    @Override
    public void deleteById(int uid) throws Exception {

        userMapper.deleteById(uid);
    }

    @Override
    public void updateUser(User user) throws Exception {
        userMapper.updateUser(user);
    }

    @Override
    public List<User> getAllUser() throws Exception {
        return userMapper.getAllUser();
    }
}
