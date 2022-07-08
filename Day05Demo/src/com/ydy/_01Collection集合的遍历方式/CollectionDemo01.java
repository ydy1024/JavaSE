package com.ydy._01Collection集合的遍历方式;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
    目标：Collection集合的遍历方式。

    什么是遍历？为什么开发中要遍历？
        遍历就是一个一个的把容器中的元素访问一遍。
        开发中经常要统计元素的总和，找最值，找出某个数据然后干掉等等业务都需要遍历。

    Collection集合的遍历方式是全部集合都可以直接使用的，所以我们学习它。
    Collection集合的遍历方式有三种：
        （1）迭代器。
        （2）foreach（增强for循环）。
        （3）JDK1.8开始之后的新技术Lambda表达式。
    a.迭代器遍历集合。
        --方法：
            --public Iterator iterator()`: 获取集合对应的迭代器，用来遍历集合中的元素的。
                E next()：获取
                boolean hasNext()：如果有下个元素返回true
        --流程：
            1.先获取当前集合的迭代器
                    Iterator<String> it=lists.iterator();
            2.定义一个while循环，问一次取一次。
                 通过it.hasNext()询问是否有下一个元素，有就通过it.next()取出下一个元素。
        小结：
            记住！

 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("姚道炎");
        lists.add("刘力皓");
        lists.add("王伟东");
        System.out.println(lists);
        //1.得到集合的迭代器对象
        Iterator<String> it=lists.iterator();
        //2.使用while循环
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
