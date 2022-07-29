package com.ydy._16代理模式.Demo;

public class UserServiceImpl implements UserService{
    @Override
    public String login(String name, String password) {
//        long start=System.currentTimeMillis();
        String rs="登录失败";
        if ("admin".equals(name)&&"123456".equals(password)){
            rs="登录成功";
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        long end=System.currentTimeMillis();
//        System.out.println("login方法耗时："+(end-start)/1000.0+"s");
        return rs;
    }

    @Override
    public void deleteUsers() {
//        long start=System.currentTimeMillis();
        try {
            System.out.println("正在删除用户中");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        long end=System.currentTimeMillis();
//        System.out.println("deleteUsers方法耗时："+(end-start)/1000.0+"s");
    }

    @Override
    public String selectUsers() {
//        long start=System.currentTimeMillis();
        String rs="查询10000个用户";
        try {
            System.out.println(rs);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        long end=System.currentTimeMillis();
//        System.out.println("selectUsers方法耗时："+(end-start)/1000.0+"s");
        return rs;
    }
}
