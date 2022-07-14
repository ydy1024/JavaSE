package com.ydy._04Map集合存储自定义类型;

import java.util.HashMap;
import java.util.Map;

/**
    目标：Map集合存储自定义类型。

    Map集合的键和值都可以存储自定义类型。

    小结：
        如果希望Map集合认为键的元素内容一样就重复了，可以重写hashCode()和equals方法！
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<Orange,String> maps = new HashMap<>();
        Orange o1 = new Orange("黄橘子", 20.3, "贼便宜！");
        Orange o2 = new Orange("黑橘子", 30.3, "坏了！");
        Orange o3 = new Orange("青橘子", 34.2, "9.9包邮！");
        Orange o4 = new Orange("黄橘子", 20.3, "贼便宜！");
        maps.put(o1,"江西\n");
        maps.put(o2,"非洲\n");
        maps.put(o3,"赣州\n");
        maps.put(o4,"湖北\n");
        System.out.println(maps);
    }
}
