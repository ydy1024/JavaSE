package com.ydy._01单元测试;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**

 */
public class UserServiceTest {
    @Before
    public void before(){
        System.out.println("---before---");
    }
    @After
    public void after(){
        System.out.println("---after---");
    }

    /**
     * 1.必须public修饰
     * 2.没有参数
     * 3.必须用@Test修饰
     */
    @Test
    public void testLogin(){
        UserService userService=new UserService();
        String rs= userService.login("admin1","123456");
        //断言预期结果的正确性
        Assert.assertEquals("登录业务有错误","success",rs);
    }
    @Test
    public void testChu(){
        UserService userService=new UserService();
        userService.chu(10,2);
    }
}
