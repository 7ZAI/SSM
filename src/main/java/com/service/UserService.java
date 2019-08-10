package com.service;

import com.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:binblink
 * @Description
 * @Date: Create on  2019/8/10 10:37
 * @Modified By:
 * @Version:1.0.0
 **/
@Service
public interface UserService {

    public int insertUser(User user) throws Exception;

    public void deleteById(int uid) throws  Exception;

    public void updateUser(User user) throws  Exception;

    public List<User> getAllUser() throws  Exception;
}
