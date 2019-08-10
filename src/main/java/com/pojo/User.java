package com.pojo;

/**
 * @author:binblink
 * @Description
 * @Date: Create on  2019/8/9 23:41
 * @Modified By:
 * @Version:1.0.0
 **/
public class User {
    private Integer uid;
    private String username;
    private String password;

    public Integer getUid() {
        return uid;
    }


    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
