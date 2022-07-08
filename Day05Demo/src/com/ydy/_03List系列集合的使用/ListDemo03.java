package com.ydy._03List系列集合的使用;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
    目标：ArrayList集合。
    Collection集合的体系：
                                                        Collection<E>(接口)
                                Set<E>(接口)                                          List<E>(接口)
                    HashSet<E>(实现类)    TreeSet<E>(实现类)                ArrayList<E>(实现类)       LinkedList<>(实现类)
        LinkedHashSet<>(实现类)
    集合的特点：
         Set系列：添加的元素是无序，不重复，无索引的。
             --HashSet：添加的元素是无序，不重复，无索引的。
             --LinkedHashSet：添加的元素是有序的，不重复的，无索引的。
             --TreeSet：不重复，无索引，按照大小默认升序排序！！
         List系列集合：添加的元素是有序，可重复，有索引。
             --ArrayList：添加的元素是有序，可重复，有索引。
             --LinkedList：添加的元素是有序，可重复，有索引。

    LinkedList也是List的实现类：底层是基于链表的，增删比较快，查询慢！
    LinkedList是支持双链表，定位前后的元素是非常快的，增删前后的元素也是最快的。
    所以LinkedList除了拥有List集合的全部功能还多了很多操作首位元素的特殊功能；
        -public void addFirst(E e):将指定元素插入此列表的开头。
        -public void addLast(E e)：将指定元素添加到此列表的结尾。
        -public E getFirst()：返回此列表的第一个元素。
        -public E getLast()：返回此列表的最后一个元素。
        -public E removeFirst()：移除并返回此列表的第一个元素。
        -public E removeLast()：移除并返回此列表的最后一个元素。
        -public E pop():从此列表所表示的堆栈处弹出一个元素。
        -public void push(E e):将元素推入此列表所表示的堆栈。

    小结：
        LinkedList是支持双链表，定位前后的元素是非常快的，增删前后的元素也是最快的。
        所以提供了很多操作首尾元素的API可以做栈和队列的实现。

        如果查询多而增删少用ArrayList集合。
        如果查询少而增删首尾较多用LinkedList集合。


 */
public class ListDemo03 {
    public static void main(String[] args) {
        //1.LinkedList做一个队列：先进先出，后进后出。
        LinkedList<String> links = new LinkedList<>();
        //入队
        links.addLast("1号");
        links.addLast("2号");
        links.addLast("3号");
        links.addLast("4号");
        System.out.println(links);
        //出队
        System.out.println(links.removeFirst());
        System.out.println(links);
        System.out.println("---------------------------------------------");
        //做一个栈
        LinkedList<String> stack = new LinkedList<>();
        stack.push("第一个子弹");
        stack.push("第二个子弹");
        stack.push("第三个子弹");
        stack.push("第四个子弹");
        System.out.println(stack);
        //弹栈
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}

