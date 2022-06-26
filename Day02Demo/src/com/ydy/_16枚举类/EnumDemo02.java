package com.ydy._16枚举类;

/**
 目标：枚举类用于做信息标志和信息分类。

 常量做信息标志和分类：虽然也挺好，但是入参不受控制，入参太随性无法严谨！

 小结：
    建议以后做信息标志和信息分类采用枚举进行！
 */
enum Oritation{
    UP,DOWN,LEFT,RIGHT
}
public class EnumDemo02 {
    public static void main(String[] args) {
        move(Oritation.RIGHT);//枚举很好
    }
    //控制玛丽移动
    public static void move(Oritation oritation){
        switch (oritation){
            case UP:
                System.out.println("向上移动👆");
                break;
            case DOWN:
                System.out.println("向下移动👇");
                break;
            case LEFT:
                System.out.println("向左移动👈");
                break;
            case RIGHT:
                System.out.println("向右移动👉");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + oritation);
        }
    }

//    public static final int UP=0;
//    public static final int DOWN=1;
//    public static final int LEFT=2;
//    public static final int RIGHT=3;
//    public static void main(String[] args) {
//        move(RIGHT);
//    }
//
//    //控制玛丽移动
//    public static void move(int oritation){
//        switch (oritation){
//            case UP:
//                System.out.println("向上移动👆");
//                break;
//            case DOWN:
//                System.out.println("向下移动👇");
//                break;
//            case LEFT:
//                System.out.println("向左移动👈");
//                break;
//            case RIGHT:
//                System.out.println("向右移动👉");
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + oritation);
//        }
//    }
}
