package com.ydy._06TreeMap集合应用;

public class Pig implements Comparable{
    private String name;
    private double price;
    private double weight;

    public Pig() {
    }

    public Pig(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
    //浮点型专属比较API
    @Override
    public int compareTo(Object o) {
        //浮点型的比较建议直接使用Java提供的API：public static int compare(double d1, double d2)
        return Double.compare(this.price,((Pig)o).price);
    }
}
