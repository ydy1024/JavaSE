package com.ydy._16代理模式.Demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    //通过一个静态方法为用户返回一个代理
    // public static UserService getProxy(UserService userService)
    public static <T> T getProxy(T obj){
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long start=System.currentTimeMillis();
                //真正触发执行方法
                Object rs = method.invoke(obj, args);
                long end=System.currentTimeMillis();
                System.out.println(method.getName()+"方法耗时："+(end-start)/1000.0+"s");
                return rs;
            }
        });
    }
}
