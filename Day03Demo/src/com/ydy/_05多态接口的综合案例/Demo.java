package com.ydy._05多态接口的综合案例;

import java.awt.event.MouseListener;
import java.security.KeyStore;

/**
    扩展：面向对象思想设计一个电脑对象，可以接入2个USB设备
    （鼠标，键盘：实现接入，调用独有功能，拔出）。
    分析：
        （1）提供2个USB设备。（USB设备必须满足：接入和拔出的功能）
        （2）定义一个USB的接口（声明USB设备的规范必须是实现接入和拔出的功能）
        （3）开始定义2个真实的实现类代表鼠标和键盘。
        （4）定义一个电脑类。

    小结：
        记住这些案例
 */
public class Demo {
    public static void main(String[] args) {
        //1.创建一个电脑
        Computer computer = new Computer();
        //2.创建一个鼠标
        USB xiaoMi=new Mouse("小米鼠标");
        computer.isntallUSB(xiaoMi);
        //3.创建一个键盘
        KeyBoard keyBoard = new KeyBoard("雷蛇键盘");
        computer.isntallUSB(keyBoard);
    }
}
class Computer{
    //安装USB设备
    public void isntallUSB(USB usb){
        if (usb instanceof Mouse){
            Mouse mouse= (Mouse) usb;
            mouse.doubleClick();
        }else if (usb instanceof KeyBoard){
            KeyBoard keyBoard= (KeyBoard) usb;
            keyBoard.keyDown();
        }
    }
}

//定义2个USB设备：鼠标，键盘
class Mouse implements USB{
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void acess() {
        System.out.println(name+"成功接入设备！");
    }

    @Override
    public void extract() {
        System.out.println(name+"成功拔出！");
    }
    //双击
    public void doubleClick(){
        System.out.println(name+"双击了！");
    }
}
class KeyBoard implements USB{
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    @Override
    public void acess() {
        System.out.println(name+"成功接入设备！");
    }

    @Override
    public void extract() {
        System.out.println(name+"成功拔出！");
    }
    //按键
    public void keyDown(){
        System.out.println(name+"按了键盘");
    }
}

//USB规范
interface USB{
    //接入
    void acess();
    //拔出
    void extract();
}
