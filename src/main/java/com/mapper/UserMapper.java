package com.mapper;

import com.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author:binblink
 * @Description
 * @Date: Create on  2019/8/9 23:44
 * @Modified By:
 * @Version:1.0.0
 **/
@Repository
public interface UserMapper {
    public int insertUser(User user) throws Exception;

    public void deleteById(int uid) throws  Exception;

    public void updateUser(User user) throws  Exception;

    public List<User> getAllUser() throws  Exception;

}
