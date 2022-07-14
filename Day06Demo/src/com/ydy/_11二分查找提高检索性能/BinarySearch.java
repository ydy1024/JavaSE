package com.ydy._11二分查找提高检索性能;

/**
    目标：二分查找

    正常查找：从第一个元素开始遍历，一个一个的往后找，综合查找比较耗时。
    二分查找：二分查找的前提：对数组是有要求的，数组必须已经排好序。
        每次先与中间的元素进行比较，如果大于往右边找，如果小于往左边找，如果等于就返回该元素索引位置！
        如果没有该元素就返回-1，

 */
public class BinarySearch {
    public static void main(String[] args) {
        //需求：找出81号元素的索引值，利用二分查找
        //1，数组
        int[] arr={10,20,33,40,45,47,53,81,87,99};
        int index=Binary(1 ,arr);
        System.out.println(index);
    }

    /**
     * 二分查找的算法实现
     * 如果元素存在返回索引
     * 如果元素不存在返回-1
     * @param target 需要查找的数字
     * @param arr 查询的数组
     * @return 存在返回索引,否则返回-1
     */
    public static int Binary(int target,int[] arr){
        int start=0;
        int end=arr.length-1;
        //定义一个循环不断的折中查找
        while (start<=end){
            //定位出中间元素的索引
            int middleIndex=(start+end)/2;
            //拿当前元素与中间元素值进行比较
            if (target>arr[middleIndex]){
                //当前元素大于中间元素，往右找，起始位置要改变
                start=middleIndex+1;
            }else if (target<arr[middleIndex]){
                //当前元素小于中间元素，往左找，起始位置要改变
                end=middleIndex-1;
            }else if (target==arr[middleIndex]){
                return middleIndex;
            }
        }
        return -1;
    }
}
