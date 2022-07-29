package com.ydy._16代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarAgentProxy {
    /**
     * 设计一个方法返回明星对象的代理对象
     */
    public static Skill getProxy(Star star){
        //为明星这个对象生成一个代理对象
        /**
         public static Object newProxyInstance(ClassLoader loader,类加载器
                                                 Class<?>[] interfaces,对象实现的接口
                                                 InvocationHandler h)
         */
        return (Skill)Proxy.newProxyInstance(star.getClass().getClassLoader(), star.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("收首付款");
                //method 正在调用的方法对象 args 代表这个方法的参数。
                Object rs = method.invoke(star, args);
                System.out.println("收尾款");
                return rs;
            }
        });
    }
}
