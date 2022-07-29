package com.ydy._16代理模式;

public class Star implements Skill{
    private String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void dance() {
        System.out.println(name+"开始跳舞");
    }

    @Override
    public void sing() {
        System.out.println(name+"开始唱歌");
    }
}
