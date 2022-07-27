package com.ydy._07序列化;

import java.io.Serializable;

public class User implements Serializable {
    //加入序列化版本号
    private static final long serialVersionUID=2L;
    private String loginName;
    //transient修饰的成员变量，将不参与序列化
    private transient String password;
    private String userName;

    public User() {
    }

    public User(String loginName, String password, String userName) {
        this.loginName = loginName;
        this.password = password;
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
