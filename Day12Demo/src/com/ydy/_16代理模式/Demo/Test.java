package com.ydy._16代理模式.Demo;

/**
    目标：掌握使用动态代理解决问题，理解使用动态代理的优势。

    需求：
        -模拟某企业用户管理业务，需包含用户登录，用户删除，用户查询功能，并要统计每个功能的耗时。
    分析：
        1.定义一个UserService表示用户业务接口，规定必须完成用户登录，用户删除，用户查询功能。
        2.定义一个实现类UserServiceImpl实现UserService，并完成相关功能，且统计每个功能的耗时。
        3.定义测试类，创建实现类对象，调用方法。
 */
public class Test {
    public static void main(String[] args) {
        UserService userService=ProxyUtil.getProxy(new UserServiceImpl());
        System.out.println(userService.login("admin","123456"));
        System.out.println(userService.selectUsers());
        userService.deleteUsers();
    }
}
