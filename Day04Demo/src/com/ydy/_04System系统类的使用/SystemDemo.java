package com.ydy._04System系统类的使用;

import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
    目标：System系统类的使用
    system代表当前系统。
    静态方法：
        1.public static void exit(int status):终止虚拟机，非0是异常终止。
        2.public static long currentTimeMillis():获取当前系统此刻时间毫秒值。
        3.可以做数组的拷贝。
            *arraycopy(Object var0,int var1,Object var2,int var3,int var4);
 *          *参数一：原数组
 *          *参数二：从原数组的哪个位置开始赋值。
 *          *参数三：目标数组。
 *          *参数四：赋值到目标数组的哪个位置。
 *          *参数五：赋值几个。
 */
public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始");
        //1.终止当前虚拟机
//        System.exit(0);
        long time=System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(time));
        //3.可以做数组的拷贝（了解）
        int[] arr1=new int[]{1,2,3,4,5,123,123,21,56,767,332,34,553,123};
        int[] arr2=new int[6];
        //arr=[0,30]
        System.arraycopy(arr1,2,arr2,0,6);
        System.out.println(Arrays.toString(arr2));
        System.out.println("程序结束");

    }
}
