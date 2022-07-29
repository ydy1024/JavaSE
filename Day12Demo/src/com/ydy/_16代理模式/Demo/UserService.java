package com.ydy._16代理模式.Demo;

public interface UserService {
    String login(String name,String password);
    void deleteUsers();
    String selectUsers();
}
