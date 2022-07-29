package com.ydy._05Dom4j解析案例;

/**
 <contact id="1" vip="true">
 <name>姚道炎</name>
 <sex>男</sex>
 <email>1285012@qq.com</email>
 </contact>
 */
public class Contact {
    private int id;
    private boolean vip;
    private String name;
    private char sex;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact.xml{" +
                "id=" + id +
                ", vip=" + vip +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                '}';
    }
}
