package com.ydy._11自定义泛型方法;

/**
    目标：自定义泛型方法。

    什么是泛型方法？

    泛型方法的定义格式：
        修饰符 <泛型变量> 返回值类型 方法名称(形参列表){

        }
        注意：
            方法定义了是什么泛型变量，后面就只能用什么泛型变量。
            泛型类的核心思想：是把出现泛型变量的地方全部替换成传输的真实数据类型。
        需求：
            给你任何一个类型的数组，都能返回它的内容。
 */
public class GenericityDemo {
    public static void main(String[] args) {
        Integer[] nums={10,20,30,40};
        System.out.println(arrToString(nums));
    }
    public static <T> String  arrToString(T[] e){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        if (e!=null&&e.length>0){
            for (int i=0;i<e.length;i++){
                T ele=e[i];
                sb.append(i==e.length-1?ele:ele+",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
